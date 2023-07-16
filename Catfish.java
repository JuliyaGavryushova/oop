public class Catfish extends Animal {

    public Catfish() {
        this("Nemo", null, null, false);
    }

    public Catfish(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
    }

    protected void swim(){
        System.out.println("Плавать");
    }
}
