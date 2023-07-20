public class Fish extends Animal implements Swimable {

    private int swimSpeed;

    // public Fish() {
    // this("Nemo", null, null, false);
    // }

    public Fish(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated, int swimSpeed) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
        this.swimSpeed = swimSpeed;
    }

    @Override
    public int swimSpeed() {
        return swimSpeed;
    }

    // @Override
    // public void swim() {
    // System.out.println(nameAnimal + " скорость передвижения в воде 7 км/ч");
    // }
}
