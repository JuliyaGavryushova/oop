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
        else if (o.getPharmacyPower() == this.getPharmacyPower()) {
            for (Component component : o) {
                for (Component comp : this) {
                    if (component.getName().compareTo(comp.getName()) != 0) {
                        return component.getName().compareTo(comp.getName());
                    }
                }
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Pharmacy that = (Pharmacy) o;
        for (Component component : that) {
            for (Component comp : this) {
                if (comp.getName() == component.getName() && comp.getWeight() == component.getWeight()
                        && comp.getPower() != component.getPower())
                    return true;
            }
        }
        return false;
        // return this.power == that.getPower() && this.name.equals(that.getName())
        // && this.weight.equals(that.getWeight());
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 0;
        for (Component component : components) {
            result = component.getName() == null ? 0 : component.getName().hashCode();
            result = prime * result + (component.getWeight() == null ? 0 : component.getWeight().hashCode());
            result = prime * result + component.getPower();
        }
        // int result = name == null ? 0 : name.hashCode();
        // result = prime * result + (weight == null ? 0 : weight.hashCode());
        // result = prime * result + power;
        // return result;
        return result;
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
