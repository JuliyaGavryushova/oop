public class JuniorNurse extends Nurse implements Analysisable {

    public JuniorNurse(String nameNurse, String surnameNurse) {
        super(nameNurse, surnameNurse);
    }

    @Override
    public void analysis() {
        System.out.println("Взятие анализов");
    }

}
