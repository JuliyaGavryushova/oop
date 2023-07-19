public class Animal implements Illable {
    protected String nameAnimal;
    protected String nameOwner;
    protected String diagnosis;
    protected boolean isVaccinated;
    protected final String TYPE = getClass().getSimpleName();

    // Конструктор
    public Animal(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        this.nameAnimal = nameAnimal;
        this.nameOwner = nameOwner;
        this.diagnosis = diagnosis;
        this.isVaccinated = isVaccinated;
    }

    public Animal() {

    }

    public boolean isVaccinated() { // геттер для получения доступа к полю (т.к. поле private)
        return this.isVaccinated;
    }

    public void setVaccinated(boolean isVaccinated) { // сеттер для изменения поля
        this.isVaccinated = isVaccinated;
    }

    public String getType(){
        return TYPE;
    }

    @Override
    public String toString(){
        return String.format("%s{name = %s, owner = %s}", TYPE, nameAnimal, nameOwner);
    }

     public String getType(String arg){
        return arg + TYPE;
    }

    @Override
    public void ill() {
        System.out.println(nameAnimal + " болеет");
    }
}