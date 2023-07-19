public class Turtle extends Animal implements Swimable {

    public Turtle(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
    }

    @Override
    public void swim() {
        System.out.println(nameAnimal + " скорость передвижения в воде 5 км/ч");
    }
}
