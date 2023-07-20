public class Parrot extends Animal implements Flyable, Soundable {

    private int flySpeed;

    // public Parrot() {
    // this("Kesha", null, null, false);
    // }

    public Parrot(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated, int flySpeed) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
        this.flySpeed = flySpeed;
    }

    @Override
    public void sound() {
        System.out.println("ааааааа");
    }

    @Override
    public int flySpeed() {
        return flySpeed;
    }

    // @Override
    // public void fly() {
    //     System.out.println(nameAnimal + " скорость полета 20 км/ч");
    // }
}
