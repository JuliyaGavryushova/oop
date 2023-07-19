public class Crow extends Animal implements Flyable, Soundable {

    public Crow(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
    }

    @Override
    public void sound() {
        System.out.println("кар-кар");
    }

    @Override
    public void fly() {
        System.out.println(nameAnimal + " скорость полета 40 км/ч");
    }
}
