public class Fish extends Animal implements Swimable {

    // public Fish() {
    // this("Nemo", null, null, false);
    // }

    public Fish(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
    }

    @Override
    public void swim() {
        System.out.println(nameAnimal + " скорость передвижения в воде 7 км/ч");
    }
}
