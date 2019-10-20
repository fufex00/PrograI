package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employees {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public int count = 0;

    private String name;

    private String ID;

    private String address;

    private String phoneNumber;

    private int workedHours;

    private String email;
    private String password;

    public Employees[] hiredEmployees;

    private WorkingSchedule[] workedHour;

    public Employees() {
    }

    public Employees(String name, String ID, String adress, String phoneNumber,
            int workedHours, String email, String password, Employees[] hiredEmployees,
            WorkingSchedule[] workedHour) {
        this.name = name;
        this.ID = ID;
        this.address = adress;
        this.phoneNumber = phoneNumber;
        this.workedHours = workedHours;
        this.email = email;
        this.password = password;
        this.workedHour = workedHour;
        this.hiredEmployees = hiredEmployees;
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
     * @return the address
     */
    public String getAdress() {
        return address;
    }

    /**
     * @param adress the address to set
     */
    public void setAdress(String adress) {
        this.address = adress;
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
    public Employees[] getHiredEmployees() {
        return hiredEmployees;
    }

    /**
     * @param hiredEmployees the hiredEmployees to set
     */
    public void setHiredEmployees(Employees[] hiredEmployees) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
