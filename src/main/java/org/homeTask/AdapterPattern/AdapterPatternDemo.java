package org.homeTask.AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String args[]){
        Menu targetInterface=new PizzaCustomer();
        targetInterface.getPizza();
        System.out.print(targetInterface.getPizzaToppings());
    }
}
