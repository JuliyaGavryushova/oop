public class Crow extends Animal implements Flyable, Soundable {

    private int flySpeed;

    public Crow(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated, int flySpeed) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
        this.flySpeed = flySpeed;
    }

    @Override
    public void sound() {
        System.out.println("кар-кар");
    }

    @Override
    public int flySpeed() {
        return flySpeed;
    }

    // @Override
    // public void fly() {
    // System.out.println(nameAnimal + " скорость полета 40 км/ч");
    // }
}
