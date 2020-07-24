package org.homeTask.Factory;

public abstract  class Animal {
    protected String sound;
    protected String foodType;
    protected String animalSize;
    abstract String getSound();
    abstract String getFoodType();
    abstract String getSize();
}
