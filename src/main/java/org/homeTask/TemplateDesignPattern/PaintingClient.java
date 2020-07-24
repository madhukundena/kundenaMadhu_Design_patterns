package org.homeTask.TemplateDesignPattern;

public class PaintingClient {
    public static void main(String args[]){
        System.out.println("Oil Painting: \n");
        PaintingTemplate template=new OilPainting();
        template.startPainting();
        System.out.println("\n/////////////////////////////////////////////////////////////////////\n");
        System.out.println("WaterColor Painting: \n");
        template=new WaterColorPainting();
        template.startPainting();
    }
}
