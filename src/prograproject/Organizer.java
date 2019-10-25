package prograproject;

public class Organizer extends Employees {

    private double organizerSalary;

    public Organizer() {
    }

    public Organizer(double organizerSalary) {
        this.organizerSalary = organizerSalary;
    }

    public Organizer(double organizerSalary, String name, String ID, String adress, String phoneNumber, int workedHours, String email, String password, Double salary) {
        super(name, ID, adress, phoneNumber, workedHours, email, password, salary);
        this.organizerSalary = organizerSalary;
    }

    public Organizer(double organizerSalary, String name) {
        super(name);
        this.organizerSalary = organizerSalary;
    }

    
    /**
     * @return the organizerSalary
     */
    public double getOrganizerSalary() {
        return organizerSalary;
    }

    /**
     * @param organizerSalary the organizerSalary to set
     */
    public void setOrganizerSalary(double organizerSalary) {
        this.organizerSalary = organizerSalary;
    }
    
}
