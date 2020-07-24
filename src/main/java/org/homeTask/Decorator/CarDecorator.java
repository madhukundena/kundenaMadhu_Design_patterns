package org.homeTask.Decorator;

public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

    @Override
    public long carPrice() {
        return this.car.carPrice();
    }
}
