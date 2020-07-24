package org.homeTask.Factory;

public class dog extends Animal {
    @Override
   String getSound() {
        return "barks";
    }

    @Override
String getFoodType() {
return "Omnivore";
    }

    @Override
String getSize() {
return "small";
    }
}
