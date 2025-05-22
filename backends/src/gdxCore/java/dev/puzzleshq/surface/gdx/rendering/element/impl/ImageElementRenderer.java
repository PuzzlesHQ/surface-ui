package dev.puzzleshq.surface.gdx.rendering.element.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import dev.puzzleshq.surface.api.element.impl.AbstractElement;
import dev.puzzleshq.surface.api.element.impl.ImageElement;
import dev.puzzleshq.surface.api.rendering.element.IElementRenderer;
import dev.puzzleshq.surface.api.screens.ISurface;
import dev.puzzleshq.surface.gdx.GDXUtil;
import dev.puzzleshq.surface.gdx.rendering.context.impl.GDXRenderContext;
import dev.puzzleshq.surface.util.ResourceLocation;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ImageElementRenderer implements IElementRenderer<GDXRenderContext, ImageElement> {

    private static final Map<ResourceLocation, Texture> textureMap = new ConcurrentHashMap<>();
    private static final AssetManager manager = new AssetManager((f) -> {
        ResourceLocation location = ResourceLocation.of(f);
        return Gdx.files.classpath("assets/%s/%s".formatted(location.getNamespace(), location.getPath()));
    });

    private int texW, texH;

    @Override
    public void render(ISurface<GDXRenderContext> surface, GDXRenderContext context, ImageElement element) {
        Texture texture = textureMap.get(element.getImageLocation());
        if (texture == null) {
            manager.load(element.getImageLocation().toString(), Texture.class);
            texture = manager.finishLoadingAsset(element.getImageLocation().toString());
            textureMap.put(element.getImageLocation(), texture);
        }
        texW = texture.getWidth();
        texH = texture.getHeight();

        Batch batch = context.getBatch();

        int rx = (int) AbstractElement.getRealX(context.getVPSize().x, element);
        int ry = (int) AbstractElement.getRealY(context.getVPSize().y, element);

        Color color = batch.getColor();
        ImageElement.Origin origin = element.getOrigin();

        GDXUtil.setColor(batch, element.getTint());
        batch.draw(
                texture,
                rx,
                ry,
                getOriginX(element, origin), getOriginY(element, origin),
                element.getTotalWidth(), element.getTotalHeight(),
                element.getVisualScale(), element.getVisualScale(),
                element.getRotation(),
                0, 0,
                texW, texH,
                false, true
        );

        batch.setColor(color);
    }

    private static float getOriginX(ImageElement element, ImageElement.Origin origin) {
        return switch (origin) {
            case TOP_LEFT, BOTTOM_LEFT -> 0.0F;
            case TOP_RIGHT, BOTTOM_RIGHT -> element.getTotalWidth();
            case CENTER -> element.getTotalWidth() / 2f;
        };
    }

    private static float getOriginY(ImageElement element, ImageElement.Origin origin) {
        return switch (origin) {
            case TOP_RIGHT, TOP_LEFT -> 0.0F;
            case BOTTOM_RIGHT, BOTTOM_LEFT -> element.getTotalHeight();
            case CENTER -> element.getTotalHeight() / 2f;
        };
    }

}
