public abstract class Nurse {
    private String nameNurse;
    private String surnameNurse;

    public Nurse(String nameNurse, String surnameNurse){
        this.nameNurse = nameNurse;
        this.surnameNurse = surnameNurse;
    }

    public String getNameNurse(){
        return nameNurse;
    }

    public String getSurnameNurse(){
        return surnameNurse;
    }
}
