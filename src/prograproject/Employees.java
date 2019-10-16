package prograproject;

public class Employees {

    private String name;

    private String ID;

    private String adress;

    private String phoneNumber;

    private int workedHours;

    private String email;

    private String[] hiredEmployees;

    private WorkingSchedule[] workedHour;

    public Employees() {
    }

    public Employees(String name, String ID, String adress, String phoneNumber, int workedHours, String email, String[] hiredEmployees, WorkingSchedule[] workedHour) {
        this.name = name;
        this.ID = ID;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.workedHours = workedHours;
        this.email = email;
        this.hiredEmployees = hiredEmployees;
        this.workedHour = workedHour;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the workedHours
     */
    public int getWorkedHours() {
        return workedHours;
    }

    /**
     * @param workedHours the workedHours to set
     */
    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the hiredEmployees
     */
    public String[] getHiredEmployees() {
        return hiredEmployees;
    }

    /**
     * @param hiredEmployees the hiredEmployees to set
     */
    public void setHiredEmployees(String[] hiredEmployees) {
        this.hiredEmployees = hiredEmployees;
    }

    /**
     * @return the workedHour
     */
    public WorkingSchedule[] getWorkedHour() {
        return workedHour;
    }

    /**
     * @param workedHour the workedHour to set
     */
    public void setWorkedHour(WorkingSchedule[] workedHour) {
        this.workedHour = workedHour;
    }
    
}
