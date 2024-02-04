public abstract class Personal {
    private String surname;
    private String name;
    private String fatherName;
    private int personalNumber;
    private String qualification;

    public Personal(String surname, String name, String fatherName, int personalNumber, String qualification) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.personalNumber = personalNumber;
        this.qualification = qualification;
    }
    public Personal(){
        this("Иванов", "Иван", "Иванович", 123, "Высшая");
    }

    public String getName(){
        return name;
    }

    public String setSurname(String surname){
        return this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public String getFatherName(){
        return fatherName;
    }

    public String getQualification(){
        return qualification;
    }

    public String getQualification(String qualification){
        return this.qualification = qualification;
    }

    public int getPersonalNumber(){
        return personalNumber;
    }
    public String getType(){
        return getClass().getSimpleName();
    }

    

    @Override
    public String toString() {
        return String.format("surname = %s, name = %s, fatherName = %s, personalNumber = %d, qualification = %s", surname, name, fatherName, personalNumber, qualification);
        
    }
}
