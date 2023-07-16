import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Экземпляр класса
        Animal yosya = new Animal("Йося", "Юля", "ожирение", false);
        // System.out.println(yosya.isVaccinated());
        yosya.setVaccinated(true);
        // System.out.println(yosya.isVaccinated());
        // System.out.println(yosya.getType());
        Cat max = new Cat();
        // System.out.println(cat.getType());
        // System.out.println(cat);

        // Animal monya = new Cat(); // Полиморфизм
        Dog sharik = new Dog();
        List<Animal> animals = new ArrayList<>();
        animals.add(max);
        animals.add(yosya);
        // animals.add(monya);
        animals.add(sharik);
        // System.out.println(animals);
        // System.out.println(monya.getType());
        // System.out.println(monya.getType("С arg "));
        // cat.hunt();
        Catfish nemo = new Catfish();
        animals.add(nemo);
        // System.out.println(animals);
        Parrot kesha = new Parrot();
        // System.out.println(kesha);
        System.out.print("Кеша: ");
        kesha.eat();
        System.out.print("Немо: ");
        nemo.eat();
        System.out.print("Макс: ");
        max.eat();
        System.out.print("Шарик: ");
        sharik.eat();
        System.out.print("Немо: ");
        nemo.swim();
        System.out.print("Кеша: ");
        kesha.fly();
        System.out.print("Йося: ");
        max.toGo();
        System.out.print("Шарик: ");
        sharik.toGo();

    }
}
