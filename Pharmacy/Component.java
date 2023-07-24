package Pharmacy;

public class Component {
    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Component that = (Component) o;
        return this.power == that.getPower() && this.name.equals(that.getName())
                && this.weight.equals(that.getWeight());
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = name == null ? 0 : name.hashCode();
        result = prime * result + (weight == null ? 0 : weight.hashCode());
        result = prime * result + power;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s {Название: %s, вес: %s, сила: %s}", getClass().getSimpleName(), this.name, this.weight,
                this.power);
    }
}
