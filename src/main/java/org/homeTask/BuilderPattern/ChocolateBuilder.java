package org.homeTask.BuilderPattern;

public class ChocolateBuilder {
    public chocolateType buildCadburyChocolate(){
        chocolateType chocolates=new chocolateType();
        chocolates.addItem(new Cadbury());
        return chocolates;
    }
    public chocolateType buildNestleChocolate(){
        chocolateType chocolates=new chocolateType();
        chocolates.addItem(new Nestle());
        return chocolates;
    }
}
