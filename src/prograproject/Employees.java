package prograproject;
import java.awt.BorderLayout;
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
    private String name="";
    private String ID="";
    private String address="";
    private String phoneNumber="";
    private int workedHours;
    private String email="";
    private String password="";
    private Double salary=0.0;
    private Double allDeductions=0.0;
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
    
//Método de Empleado, permite ciertas acciones a realizar por los Empleados. 
    public void employeeMenu(String user, String password) throws IOException {
        System.out.println("Bienvenido(a) al Menú de Empleado " + searchEmployee(user)
                .getName());
        System.out.println("******************************\n");
        System.out.println("1. Marcar hora de entrada");
        System.out.println("2. Marcar hora de salida");//Acciones que pueden 
        System.out.println("3. Cambiar contraseña");//realizar los Empleados.
        System.out.println("4. Ver horas trabajadas");
        System.out.println("5. Salir");
        int selec;
        try {
            selec = Integer.parseInt(br.readLine());
            switch (selec) {
                case 1:
                    inHours();
                    inMinutes();
                    System.out.println(inh);
                    System.out.println(inm);
                    employeeMenu(user, password);
                    break;
                case 2:
                    outHours();
                    outMinutes();
                    System.out.println(outh);
                    System.out.println(outm);
                    searchEmployee(user).setWorkedHours(calculateHoursInt());
                    employeeMenu(user, password);
                    break;
                    
                //Caso para cambiar la contraseña del Empleado, función propia.    
                case 3:
                    System.out.println("Ingrese su contraseña actual:");
                    String pass = br.readLine();
                    if (password.equals(pass)) {
                        System.out.println("Ingrese su nueva contraseña:");
                        String newPass = br.readLine();
                        searchEmployee(user).setPassword(newPass);
                        employeeMenu(user, password);
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
                        resetTimeStats();
                        Thread.sleep(500);
                        Principal.login();
                    } catch (InterruptedException ex) {
                        System.err.println("Hubo un error.");
                    }
                    break;
                default:
                    System.out.println("No ingresó un valor adecuado, inténtelo de nuevo.\n");
                    employeeMenu(user, password);
            }
        } catch (NumberFormatException rr) {
            System.out.println("Los valores ingresados son incorrectos");
            employeeMenu(user, password);
        }
    }
    
//Método que funciona para buscar Empleado y retornarlo si existe.
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
    
//Mostrar los datos de los Empleados que fueron registrados.
    public void showData( int id,Double salario,int hours,String ocupation ){
        salary=salario;
        int salaryhour=0;
        if (ocupation.equals("Boss")){
            salaryhour=2500;
        }
        if(ocupation.equals("Cashier")){
            salaryhour=1400;
        }
        if(ocupation.equals("CleaningAttendant")){
            salaryhour=1250;
        }
        if (ocupation.equals("Organizer")){
            salaryhour=1525;
        }
        if (ocupation.equals("Secretary")){
            salaryhour=1980;
        }
        if (ocupation.equals("Seller")){
            salaryhour=1650;
        }
        if (hours>=160){
        System.out.print("Salario ");
        System.out.print("Salario Bruto: "+ salario+"\n");    
        System.out.print("Rebajos: "+ taxes()+"\n");
        System.out.print("CCSS: "+ CCSS()+"\n");
        System.out.print("Total Deducciones "+(taxes()+CCSS() )+"\n");
        System.out.println("Salario Neto: "+(salario-(taxes()+CCSS() ))+"\n");
        }
        if (hours<160){
        System.out.print("Bonificación  por horas Laboradas "+"\n");    
        System.out.print("Bonificación Bruta: "+ salario+"\n");
        System.out.print("Rebajos: "+ taxes()+"\n");
        System.out.print("CCSS: "+ CCSS()+"\n");
        System.out.print("Total Deducciones "+(taxes()+CCSS() )+"\n");
        System.out.println("Bonificación Neta: "+((salaryhour*hours)-(taxes()+CCSS()))+"\n");
        }
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
    public int inHours() {
        String dateAsAString = hour.format(new Date());
        inh = Integer.parseInt(dateAsAString);
        return inh;
    }
    public int outHours() {
        String dateAsAString = hour.format(new Date());
        outh = Integer.parseInt(dateAsAString);
        return outh;
    }
    public int inMinutes() {
        String dateAsAString = min.format(new Date());
        inm = Integer.parseInt(dateAsAString);

        return inm;
    }
    public int outMinutes() {
        String dateAsAString = min.format(new Date());
        outm = Integer.parseInt(dateAsAString);
        return outm;
    }
    public int calculateHoursInt() {
        dayHours = outh - inh;
        workedHour = workedHour + dayHours;
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
        return workedHour;
    }
    public void resetTimeStats(){
        workedHour=0;
        workedMinutes=0;
        inm=0;
        inh=0;
        outm=0;
        outh=0;
        dayMinutes=0;
        dayHours=0;               
    }
}
