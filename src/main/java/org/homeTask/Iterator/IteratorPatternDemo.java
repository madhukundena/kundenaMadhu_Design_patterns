package org.homeTask.Iterator;
public class IteratorPatternDemo {
    public static void main(String[] args) {
        CollectionOfDesserts obj = new CollectionOfDesserts();

        for(Iterator iter = obj.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Dessert Name : " + name);
        }
    }
}
