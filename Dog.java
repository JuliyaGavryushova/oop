public class Dog extends Animal implements Soundable, Runnable {

    // public Dog() {
    // this("Sharik", null, null, false);
    // }

    public Dog(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
    }

    @Override
    public void sound() {
        System.out.println("гав-гав");
    }

    @Override
    public void run() {
        System.out.println(nameAnimal + " скорость бега 20 км/ч");
    }
}
