package org.homeTask.BuilderPattern;

public class BuilderDemo {

    public static void main(String args[]){
       ChocolateBuilder chocBuilder=new ChocolateBuilder();
        chocolateType chocType1=chocBuilder.buildCadburyChocolate();
        chocType1.showItems();

       chocolateType chocType2=chocBuilder.buildNestleChocolate();
        chocType2.showItems();
    }
}
