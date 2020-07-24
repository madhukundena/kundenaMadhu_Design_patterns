package org.homeTask.TemplateDesignPattern;

public class WaterColorPainting extends PaintingTemplate {
    @Override
    public void selectPaints() {
        System.out.println("Winsor & Newton WaterColors selected");

    }

    @Override
    public void selectPaperType() {
        System.out.println("ColdPressed paper selected");

    }

    @Override
    public void selectBrushes() {
        System.out.println("Round, fine brushes selected");

    }
}
