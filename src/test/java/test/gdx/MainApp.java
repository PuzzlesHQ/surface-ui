package test.gdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;

public class MainApp extends ApplicationAdapter {
    private SpriteBatch batch;
    private GameBootingScreenGDX screenGDX;

    private GDXRenderContext context;
    private int curWidth, curHeight;

    @Override
    public void create() {
        this.batch = new SpriteBatch();
        this.screenGDX = new GameBootingScreenGDX();
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
        this.context.getBatch().setProjectionMatrix(this.context.getCamera().combined);
    }

    @Override
    public void render() {
        int screenWidth = Gdx.graphics.getWidth();
        int screenHeight = Gdx.graphics.getHeight();
        if (this.curWidth != screenWidth || this.curHeight != screenHeight) {
            this.resize(screenWidth, screenHeight);
        }

        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        this.batch.begin();
        this.screenGDX.render(this.context);
        this.batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
