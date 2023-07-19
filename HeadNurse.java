public class HeadNurse extends Nurse implements Assistanceable {

    public HeadNurse(String nameNurse, String surnameNurse) {
        super(nameNurse, surnameNurse);
    }

    @Override
    public void assistance() {
        System.out.println("Ассистирование при операции");
    }

}
