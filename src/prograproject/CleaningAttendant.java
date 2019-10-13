package prograproject;

public class CleaningAttendant extends Employees {

    private double cleaningSalary;

    public CleaningAttendant() {
    }

    public CleaningAttendant(double cleaningSalary) {
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
