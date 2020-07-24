package org.homeTask.Factory;

public class cat extends Animal {

    @Override
    String getSound() {
return "meows";
    }

    @Override
    String getFoodType() {
return "carnivore";
    }

    @Override
   String getSize() {
return "small";
    }
}
