public class Parrot extends Animal {

    public Parrot() {
        this("Kesha", null, null, false);
    }

    public Parrot(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
    }

    protected void fly(){
        System.out.println("Летать");
    }
}
