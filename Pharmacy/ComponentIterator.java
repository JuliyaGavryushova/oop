package Pharmacy;

import java.util.Iterator;

public class ComponentIterator implements Iterator<Component> {
    private int index;
    private Pharmacy pharmacy;

    public ComponentIterator(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < pharmacy.getComponents().size();
    }

    @Override
    public Component next() {
        return pharmacy.getComponents().get(index++);
    }

}
