package prograproject;

public class Secretary extends Employees {

    private double secretarySalary;

    public Secretary() {
    }

    public Secretary(double secretarySalary) {
        this.secretarySalary = secretarySalary;
    }

    public Secretary(double secretarySalary, String name, String ID, String adress, String phoneNumber, int workedHours, String email, String password, Double salary) {
        super(name, ID, adress, phoneNumber, workedHours, email, password, salary);
        this.secretarySalary = secretarySalary;
    }

    public Secretary(double secretarySalary, String name) {
        super(name);
        this.secretarySalary = secretarySalary;
    }


    
    /**
     * @return the secretarySalary
     */
    public double getSecretarySalary() {
        return secretarySalary;
    }

    /**
     * @param secretarySalary the secretarySalary to set
     */
    public void setSecretarySalary(double secretarySalary) {
        this.secretarySalary = secretarySalary;
    }
    
}
