import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Person {

    private String name, surname;
    private Date birthDate;
    private boolean anotherCompanyOwner, pensioner, publicServer;
    private float salary;

    public Person() {
    }

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }

    public String fullName(){
        return name + " " + surname;
    }

    public double calculateYearlySalary(){

        return this.salary * 12;
    }

    public boolean isMEI(){
        int age = LocalDate.now().getYear() - birthDate.toInstant().atZone( ZoneId.systemDefault() ).toLocalDate().getYear();
        boolean valid = (anotherCompanyOwner && pensioner && publicServer);
        if (calculateYearlySalary() < 130000 && age > 18 && !valid){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
