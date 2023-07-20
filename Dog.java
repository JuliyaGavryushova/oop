public class Dog extends Animal implements Soundable, Runnable {

    private int runSpeed;

    // public Dog() {
    // this("Sharik", null, null, false);
    // }

    public Dog(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated, int runSpeed) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
        this.runSpeed = runSpeed;
    }

    @Override
    public void sound() {
        System.out.println("гав-гав");
    }

    @Override
    public int runSpeed() {
       return runSpeed;
    }

    // @Override
    // public void run() {
    //     System.out.println(nameAnimal + " скорость бега 20 км/ч");
    // }
}
