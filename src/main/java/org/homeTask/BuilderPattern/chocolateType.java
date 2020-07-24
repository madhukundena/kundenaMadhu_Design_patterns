package org.homeTask.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class chocolateType {
    private List<Packing> items = new ArrayList<Packing>();

    public void addItem(Packing packs) {
        items.add(packs);
    }

    public void getCost() {
        for (Packing packs : items) {
            packs.price();
        }
    }

    public void showItems() {
        for (Packing packing : items) {
            System.out.print("Chocolate name : " + packing.pack());
            System.out.println(", Price : " + packing.price());
        }
    }
}
