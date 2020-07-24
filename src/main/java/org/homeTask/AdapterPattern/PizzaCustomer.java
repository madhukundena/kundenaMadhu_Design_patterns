package org.homeTask.AdapterPattern;
import java.io.*;

public class PizzaCustomer extends Pizza implements Menu {
    public void getPizza(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the pizza name :");
            String pizzaname=br.readLine();
            System.out.print("Enter the pizza size:");
            String pizzasize=br.readLine();
            System.out.print("Enter the pizza price:");
           int pizzaprice=Integer.parseInt(br.readLine());

          setPizzaName(pizzaname);
          setPizzaPrice(pizzaprice);
          setPizzaSize(pizzasize);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public String getPizzaToppings() {
        String pizzaname=getPizzaName();
        String pizzasize=getPizzaSize();
        int pizzaprice=getPizzaPrice();
        return ("The pizza : "+pizzaname+" of size: "+pizzasize+" is of Rs "+pizzaprice);
    }
}
