package org.homeTask.TemplateDesignPattern;

public class OilPainting extends PaintingTemplate {
    @Override
    public void selectPaints() {
        System.out.println("Camlin Oil paints selected");
    }

    @Override
    public void selectPaperType() {
        System.out.println("Hotpressed paper selected");

    }

    @Override
    public void selectBrushes() {
        System.out.println("Round,Flat brushes selected");

    }
}
