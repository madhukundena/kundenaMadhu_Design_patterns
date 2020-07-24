package org.homeTask.Decorator;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

    @Override
    public long carPrice() {
        return 600000;
    }
}
