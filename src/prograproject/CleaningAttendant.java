package prograproject;

public class CleaningAttendant extends Employees {

    private double cleaningSalary;

    public CleaningAttendant(double cleaningSalary) {
        this.cleaningSalary = cleaningSalary;
    }

    public CleaningAttendant(String name, String ID, String adress, String phoneNumber, int workedHours, String email, String password, Double salary) {
        super(name, ID, adress, phoneNumber, workedHours, email, password, salary);
    }

    public CleaningAttendant(double cleaningSalary, String name) {
        super(name);
        this.cleaningSalary = cleaningSalary;
    }


    /**
     * @return the cleaningSalary
     */
    public double getCleaningSalary() {
        return cleaningSalary;
    }

    /**
     * @param cleaningSalary the cleaningSalary to set
     */
    public void setCleaningSalary(double cleaningSalary) {
        this.cleaningSalary = cleaningSalary;
    }
    
}
