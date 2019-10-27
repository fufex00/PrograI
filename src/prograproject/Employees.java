package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void employeeMenu() {
        System.out.println("Bienvenido al Menú de Empleado");
        System.out.println("******************************\n");
        System.out.println("1. Marcar hora de entrada");
        System.out.println("2. Marcar hora de salida");
        System.out.println("3. Cambiar contraseña");
        System.out.println("4. Ver horas trabajadas");
        System.out.println("5. Tipo de pago");
        System.out.println("6. Salir");
        int selec;
        try {
            selec = Integer.parseInt(br.readLine());
            switch (selec) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Los valores ingresados no son correctos");
                    employeeMenu();
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
