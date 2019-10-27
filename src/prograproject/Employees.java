package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class Employees {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Principal data = new Principal();

    SimpleDateFormat hour = new SimpleDateFormat("HH");
    SimpleDateFormat min = new SimpleDateFormat("mm");
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

    public void employeeMenu(String user) throws IOException {
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
                    inHours();
                    inMinutes();
                    System.out.println(workedHour);
                    employeeMenu(user);
                    break;
                case 2:
                    outHours();
                    outMinutes();
                    System.out.println(workedHour);
                    searchEmployee(user).setWorkedHours(workedHour);
                    for (int i = 0; i < data.getCounter() && Principal.employeeData[i] != null; i++) {
                        if (Principal.employeeData[i].getID().equals(user)) {
                            System.out.println(Principal.employeeData[i].getWorkedHours());
                        }
                    }
                    System.out.println(workedHour);
                    employeeMenu(user);
                    break;
                case 3:
                    System.out.println(user);
                    for (int i = 0; i < data.getCounter() && Principal.employeeData[i] != null; i++) {
                        if (Principal.employeeData[i].getID().equals(user)) {
                            System.out.println(Principal.employeeData[i].getName());
                        }
                    }
                    break;
                case 4:

                    System.out.println("Horas:" + workedHour);
                    break;
                case 5:

                    break;
                case 6:
                    Principal.login();
                default:
                    System.out.println("Los valores ingresados no son correctos");

                    break;
            }
        } catch (NumberFormatException rr) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, rr);
        }
    }

    private Employees searchEmployee(String user) {
        for (int i = 0; i < data.getCounter() && Principal.employeeData[i] != null; i++) {
            if (Principal.employeeData[i].getID().equals(user)) {
                Employees found;
                found = Principal.employeeData[i];
                return found;
            }

        }
        return null;
    }

    public Date date = new Date();
    public int inh = 0;
    public int outh = 0;
    public int inm = 0;
    public int outm;
    public int workedminutes = 0;
    public int dayhours = 0;
    public int dayMinutes = 0;
    int temporalminutes = 0;
    public int workedHour = 0;

    String dateAsAString = min.format(new Date());

    public int inHours() {
        inh = Integer.parseInt(dateAsAString);
        return inh;
    }

    public int outHours() {
        outh = Integer.parseInt(dateAsAString);
        return outh;
    }

    public int inMinutes() {
        inm = Integer.parseInt(dateAsAString);

        return inm;
    }

    public int outMinutes() {
        outm = Integer.parseInt(dateAsAString);
        return outm;
    }

    public int calculateHoursInt() {
        dayhours = outh - inh;
        workedHour = workedHour + dayhours;

        return workedHour;
    }

    public int calculateMinutesInt() {
        dayMinutes = outm - inm;
        workedminutes = workedminutes + dayMinutes;
        if (workedminutes == 60) {
            temporalminutes = workedminutes / 60;
            workedHour = temporalminutes + workedHour;
            workedminutes = workedminutes % 60;
        }
        if (workedminutes > 60) {
            temporalminutes = workedminutes / 60;
            workedHour = temporalminutes + workedHour;
            workedminutes = workedminutes % 60;
        }

        return workedminutes;
    }

}
