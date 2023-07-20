public class Turtle extends Animal implements Swimable {

    private int swimSpeed;

    public Turtle(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated, int swimSpeed) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public int swimSpeed() {
        return swimSpeed;
    }

    // @Override
    // public void swim() {
    // System.out.println(nameAnimal + " скорость передвижения в воде 5 км/ч");
    // }
}
