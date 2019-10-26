package prograproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

    private Double salary;

    public Employees() {
    }

    public Employees(String name, String ID, String adress, String phoneNumber,
            int workedHours, String email, String password, Double salary) {
        this.name = name;
        this.ID = ID;
        this.address = adress;
        this.phoneNumber = phoneNumber;
        this.workedHours = workedHours;
        this.email = email;
        this.password = password;
        this.salary = salary;
    }

    public Employees(String name) {
        this.name = name;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setNetSalary() {
        this.salary -= deducciones();
    }

    public double deducciones() {

        double deducciones = CCSS() + Impuesto();
        System.out.println(deducciones);
        return deducciones;
    }

    private double CCSS() {
        return salary * 0.0984;
    }

    private double Impuesto() {
        if (salary > 817000.0 && salary <= 1226000.0) {

            return (salary - 817000.0) * 0.10;

        } else if (salary > 1226000.0) {

            return 40900.0 + ((salary - 1226000.0) * 0.15);

        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Employees{" + "name=" + name + ", ID=" + ID + ", address=" + address + ", phoneNumber=" + phoneNumber + ", workedHours=" + workedHours + ", email=" + email + ", salary=" + salary + '}';
    }

    public DateFormat generateDate(DateFormat date) {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        System.out.println(df.format(calobj.getTime()));
        df.format(calobj.getTime());
        date = df;
        return date;
    }
}
