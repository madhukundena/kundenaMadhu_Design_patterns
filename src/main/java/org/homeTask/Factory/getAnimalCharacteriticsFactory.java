package org.homeTask.Factory;

public class getAnimalCharacteriticsFactory {
    public Animal getAnimal(String animal){
        if(animal == null){
            return null;
        }
        if(animal.equalsIgnoreCase("cat")) {
            return new cat();
        }
        else if(animal.equalsIgnoreCase("dog")){
            return new dog();
        }
        else if(animal.equalsIgnoreCase("elephant")) {
            return new elephant();
        }
        return null;
    }
}
