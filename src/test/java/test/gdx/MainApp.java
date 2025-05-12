package test.gdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import dev.puzzlehq.surface.gdx.lwjgl3.SurfaceUILwjgl3Gdx;
import dev.puzzleshq.surface.SurfaceSupervisor;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.cereal.io.SurfaceDeserializer;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;
import dev.puzzleshq.surface.util.RawAssetLoader;
import dev.puzzleshq.surface.util.ResourceLocation;
import dev.puzzleshq.surface.util.SurfacePoint;
import org.lwjgl.glfw.GLFW;

public class MainApp extends ApplicationAdapter {
    private SpriteBatch batch;
    private ISurface screenGDX;

    private GDXRenderContext context;
    private int curWidth, curHeight;

    @Override
    public void create() {
        SurfaceUILwjgl3Gdx.addSurfaceInputCapabilities();

        this.batch = new SpriteBatch();
        this.screenGDX = SurfaceDeserializer.deserialize(RawAssetLoader.getClassPathAsset(ResourceLocation.of("cereal:ui/cosmic-reach/main-menu.json5")).getString());
//        this.screenGDX = SurfaceDeserializer.deserialize(RawAssetLoader.getClassPathAsset(ResourceLocation.of("cereal:ui/mod-loading-screen.json5")).getString());
        SurfaceSupervisor.setSurface(this.screenGDX.getId());
        Camera camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        camera.up.set(0.0F, -1.0F, 0.0F);
        camera.direction.set(0.0F, 0.0F, 1.0F);
        camera.update();
        ExtendViewport viewport = new ExtendViewport(800, 600, camera);
        viewport.apply(true);
        this.context = new GDXRenderContext(
                batch,
                viewport,
                camera
        );
    }

    @Override
    public void resize(int width, int height) {
        this.curWidth = width;
        this.curHeight = height;
        this.context.getViewport().update(width, height, false);
        this.context.updateVp();
        this.context.getBatch().setProjectionMatrix(this.context.getCamera().combined);

        Vector2 vector2 = new Vector2();
        SurfaceSupervisor.POINT_UNPROJECTION_FUNCTION = (s) -> {
            vector2.x = s.x;
            vector2.y = s.y;

            context.getViewport().unproject(vector2);

            return new SurfacePoint(vector2.x, vector2.y);
        };
    }

    @Override
    public void render() {
        int screenWidth = Gdx.graphics.getWidth();
        int screenHeight = Gdx.graphics.getHeight();
        if (this.curWidth != screenWidth || this.curHeight != screenHeight) {
            this.resize(screenWidth, screenHeight);
        }

        ScreenUtils.clear(240 / 255f, 240 / 255f, 240 / 255f, 1f);
        this.batch.begin();

        SurfaceSupervisor.renderCurrentSurface(this.context);
//        this.screenGDX.render(this.context);
        this.batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
