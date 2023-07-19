public class Surgeon extends Doctor implements Surgeryable {

    public Surgeon(String nameDoctor, String surnameDoctor) {
        super(nameDoctor, surnameDoctor);
    }

    @Override
    public void operation() {
        System.out.println("Проведение операции");
    }

}
