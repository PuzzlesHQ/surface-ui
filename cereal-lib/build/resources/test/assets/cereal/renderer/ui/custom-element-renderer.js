function render(element, elementContext, renderContext, batch) {
    const posX = elementContext.getVisualX();
    const posY = elementContext.getVisualY();

    const style = element.getStyle();
    const halfThickness = style.outlineThickness * .5;

    batch.setColor(style.outlineColor[0], style.outlineColor[1], style.outlineColor[2]);
    batch.rect(posX, posY, elementContext.getVisualWidth(), elementContext.getVisualHeight());

    batch.setColor(style.backgroundColor[0], style.backgroundColor[1], style.backgroundColor[2]);
    batch.rect(posX + halfThickness, posY + halfThickness, element.getWidth(), element.getHeight());
}