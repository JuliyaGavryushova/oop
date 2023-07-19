public class Parrot extends Animal implements Flyable, Soundable {

    // public Parrot() {
    // this("Kesha", null, null, false);
    // }

    public Parrot(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
    }

    @Override
    public void sound() {
        System.out.println("ааааааа");
    }

    @Override
    public void fly() {
        System.out.println(nameAnimal + " скорость полета 20 км/ч");
    }
}
