package org.homeTask.Decorator;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }

    @Override
    public long carPrice(){
        return 2500000;
    }
}
