import java.util.ArrayList;
import java.util.List;

public class VetClinica {
    private final List<Animal> animals;

    public VetClinica() {
        this.animals = new ArrayList<>();
    }

    public VetClinica addNewAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    // 1 вариант получения списка всех летающих животных
    public List<Animal> getFlyingAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                result.add(animal);
            }
        }
        return result;
    }

    // 2 вариант (кастинг (приведение типов данных))
    // public List<Flyable> getFlyingAnimals() {
    // List<Flyable> result = new ArrayList<>();
    // for (Animal animal : animals) {
    // if (animal instanceof Flyable) {
    // result.add((Flyable) animal);
    // }
    // }
    // return result;
    // }

    public List<Animal> getRunningAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Runnable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getSwimingAnimals() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getSoundAnimal() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Soundable) {
                result.add(animal);
            }
        }
        return result;
    }
}
