package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employees {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Principal data = new Principal();

    SimpleDateFormat hour = new SimpleDateFormat("HH");
    SimpleDateFormat min = new SimpleDateFormat("mm");
    private int workedHours;
    private Double allDeductions;
    private Double salary;
    private String address;
    private String email;
    private String ID;
    private String name;
    private String password;
    private String phoneNumber;
    
    
  

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
    
    public Employees(String name, String ID, String adress, String phoneNumber,
            int workedHours, String email, String password, Double salary, Double allDeductions) {
        this.name = name;
        this.ID = ID;
        this.address = adress;
        this.phoneNumber = phoneNumber;
        this.workedHours = workedHours;
        this.email = email;
        this.password = password;
        this.salary = salary;
        this.allDeductions = allDeductions;
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

    public Double getAllDeductions() {
        return allDeductions;
    }

    public void setAllDeductions(Double allDeductions) {
        this.allDeductions = allDeductions + deductions();
    }

    public void setDeductions(){
       this.allDeductions += deductions(); 
    }
    
    public void setNetSalary() {
        this.salary -= deductions();
    }

    public double deductions() {

        double deductions = CCSS() + taxes();
        System.out.println("Deducciones: " + deductions);
        return deductions;
    }

    private double CCSS() {
        return salary * 0.0984;
    }

    private double taxes() {
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
        return "Employees{" + "name=" + name + ", ID=" + ID + ", workedHours=" + workedHours + ", salary=" + salary + ", allDeductions=" + allDeductions + '}';
    }  
    
//Menú exclusivo de Empleado con su respectivo usuario.
    public void employeeMenu(String user, String password) throws IOException {
        System.out.println("Bienvenido(a) al Menú de Empleado " + searchEmployee(user)
                .getName());
        System.out.println("******************************\n");
        System.out.println("1. Marcar hora de entrada");
        System.out.println("2. Marcar hora de salida");                         //Opciones de menú para Empleado.
        System.out.println("3. Cambiar contraseña");
        System.out.println("4. Ver horas trabajadas");
        System.out.println("5. Salir");
        int selec;
        try {
            selec = Integer.parseInt(br.readLine());
            switch (selec) {
                case 1:
                    inHours();
                    inMinutes();
                    System.out.println(workedHour);
                    employeeMenu(user, password);
                    break;
                case 2:
                    outHours();
                    outMinutes();
                    calculateMinutesInt();
                    calculateHoursInt();
                    searchEmployee(user).setWorkedHours(workedHour);
                    employeeMenu(user, password);
                    break;
                case 3:
                    System.out.println("Ingrese su contraseña actual:");
                    String pass = br.readLine();
                    if (password.equals(pass)) {
                        System.out.println("Ingrese su nueva contraseña:");
                        String newPass = br.readLine();
                        searchEmployee(user).setPassword(newPass);
                    }
                    System.out.println("La contraseña es incorrecta, inténtelo otra vez");
                    employeeMenu(user, password);
                    break;
                case 4:
                    System.out.println("Horas trabajadas: " + searchEmployee(user).getWorkedHours());
                    employeeMenu(user, password);
                    break;
                case 5:
                    try {
                        System.out.println("Cerrando Sesión...");
                        Thread.sleep(500);
                        Principal.login();
                    } catch (InterruptedException ex) {
                        System.err.println("Hubo un error.");
                    }
                    break;
                default:
                    System.out.println("No ingreso un valor adecuado, inténtelo de nuevo.\n");
                    employeeMenu(user, password);
            }
        } catch (NumberFormatException rr) {
            System.out.println("Los valores ingresados son incorrectos");
            employeeMenu(user, password);
        }
    }
    
//Permite buscar al Empleado.
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
    public int workedMinutes = 0;
    public int dayHours = 0;
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
        dayHours = outh - inh;
        workedHour = workedHour + dayHours;

        return workedHour;
    }

    public int calculateMinutesInt() {
        dayMinutes = outm - inm;
        workedMinutes = workedMinutes + dayMinutes;
        if (workedMinutes == 60) {
            temporalminutes = workedMinutes / 60;
            workedHour = temporalminutes + workedHour;
            workedMinutes = workedMinutes % 60;
        }
        if (workedMinutes > 60) {
            temporalminutes = workedMinutes / 60;
            workedHour = temporalminutes + workedHour;
            workedMinutes = workedMinutes % 60;
        }

        return workedMinutes;
    }
}
