public class Cat extends Animal implements Soundable, Runnable {
    // public Cat() {
    // this("Max", null, null, false);
    // }

    public Cat(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
    }

    @Override
    public void sound() {
        System.out.println("мяу-мяу");
    }

    @Override
    public void run() {
        System.out.println(nameAnimal + " скорость бега 15 км/ч");
    }

    // private void wakeUp() {
    // System.out.println("Кот проснулся");
    // }

    // private void findFood() {
    // System.out.println("Кот нашел еду");
    // }

    // private void eat() {
    // System.out.println("Кот поел");
    // }

    // private void sleep() {
    // System.out.println("Кот уснул");
    // }

    // public void hunt() {
    // wakeUp();
    // findFood();
    // eat();
    // sleep();
    // }
}
