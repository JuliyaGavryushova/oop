public class Therapist extends Doctor implements Checkable{

    public Therapist(String nameDoctor, String surnameDoctor) {
        super(nameDoctor, surnameDoctor);
    }

    @Override
    public void check() {
        System.out.println("Осмотр пациента");
    }

}
