public class Dog extends Animal{
    
    public Dog() {
        this("Sharik", null, null, false);
    }
    
    public Dog(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
    }

    protected void toGo(){
        System.out.println("Бегать");
    }
}
