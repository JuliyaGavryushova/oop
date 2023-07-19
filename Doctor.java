public abstract class Doctor {
    private String nameDoctor;
    private String surnameDoctor;
    
    public Doctor(String nameDoctor, String surnameDoctor){
        this.nameDoctor = nameDoctor;
        this.surnameDoctor = surnameDoctor;
    }

    public String getNameDoctor(){
        return nameDoctor;
    }

    public String getSurnameDoctor(){
        return surnameDoctor;
    }
}
