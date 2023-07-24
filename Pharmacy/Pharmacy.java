package Pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;
    // private int index;

    public Pharmacy() {
        this.components = new ArrayList<>();
        // this.index = 0;
    }

    public List<Component> getComponents() {
        return components;
    }

    public Pharmacy addComponent(Component component) {
        this.components.add(component);
        return this;
    }

    private int getPharmacyPower() {
        int power = 0;
        for (Component component : components) {
            power += component.getPower();
        }
        return power;
    }

    // @Override
    // public boolean hasNext() {
    // return index < components.size();
    // }

    // @Override
    // public Component next() {
    // return components.get(index++);
    // }

    @Override
    public String toString() {
        return String.format("%s Состав: %s, сила: %s %n", getClass().getSimpleName(), this.components,
                this.getPharmacyPower());
    }

    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }

    @Override
    public int compareTo(Pharmacy o) {
        if (o.getPharmacyPower() > this.getPharmacyPower())
            return 10;
        else if (o.getPharmacyPower() < this.getPharmacyPower())
            return -10;
        return 0;
    }

    // @Override
    // public Iterator<Component> iterator() {
    // return new Iterator<Component>() {

    // @Override
    // public boolean hasNext() {
    // return index < components.size();
    // }

    // @Override
    // public Component next() {
    // return components.get(index++);
    // }

    // };
    // }
}
