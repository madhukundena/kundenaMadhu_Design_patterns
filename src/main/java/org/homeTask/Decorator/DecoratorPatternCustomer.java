package org.homeTask.Decorator;

import java.io.*;
import java.util.Scanner;

public class DecoratorPatternCustomer {
    public static void main(String args[]) throws IOException,NumberFormatException{
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.print("\n========= Car Menu ============ \n");
            System.out.print("1. Basic Car.\n");
            System.out.print("2. Luxury Car.\n");
            System.out.print("3. Sports Car.\n");
            System.out.print("4. Exit \n");
            System.out.print("Enter your choice: ");
         choice=sc.nextInt();
            switch (choice) {
                case 1:{
                    BasicCar bcar=new BasicCar();
                   bcar.assemble();
                  System.out.println("\nCost of Basic Car is: Rs "+bcar.carPrice());
                }
                break;

                case 2:{
                   Car c1=new LuxuryCar((Car) new BasicCar());
                    c1.assemble();
                    System.out.println("\nCost of Luxury Car is: Rs "+c1.carPrice());
                }
                break;
                case 3:{
                    Car c2=new SportsCar((Car) new BasicCar());
                    c2.assemble();
                    System.out.println("\nCost of Sports Car is: Rs "+c2.carPrice());
                }
                break;

                default:{
                    System.out.println("Other than these no cars are available");
                }
                return;
            }

        }while(choice!=4);
    }
}
