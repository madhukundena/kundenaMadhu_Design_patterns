package org.homeTask.BuilderPattern;

public class Nestle extends  Company {
    @Override
    public int price(){
        return 10;
    }
    @Override
    public String pack(){
        return "Nestle Milky Bar";
    }
}
