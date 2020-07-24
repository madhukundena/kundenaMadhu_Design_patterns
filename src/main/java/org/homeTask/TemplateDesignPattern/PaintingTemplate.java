package org.homeTask.TemplateDesignPattern;

public abstract class PaintingTemplate {
    public final void startPainting(){
     selectMedium();
      selectPaints();
      selectPaperType();
      selectBrushes();
    }
    private void selectMedium(){
        System.out.println("Medium selected for painting is Paper");
    }
    public abstract void selectPaints();
    public abstract void selectPaperType();
    public abstract void selectBrushes();
}
