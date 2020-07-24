package org.homeTask.Iterator;

public class CollectionOfDesserts implements Container {
public String desserts[]={"Cookies","Cakes","Candies","Chocolates","Custards","Puddings","Jellies"};
    @Override
    public Iterator getIterator() {
        return new CollectionOfDessertsIterate();
    }
    private class CollectionOfDessertsIterate implements Iterator{
        int i;
        @Override
        public boolean hasNext() {
            if (i<desserts.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return desserts[i++];
            }
            return null;
        }
    }
}
