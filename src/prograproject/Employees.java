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

    private Employees[] hiredEmployees = new Employees[15];

    private WorkingSchedule[] workedHour;

    public Employees() {
    }

    public Employees(String name, String ID, String adress, String phoneNumber,
            int workedHours, String email, Employees[] hiredEmployees,
            WorkingSchedule[] workedHour) {
        this.name = name;
        this.ID = ID;
        this.address = adress;
        this.phoneNumber = phoneNumber;
        this.workedHours = workedHours;
        this.email = email;
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

    public void editFields() throws IOException {
        System.out.println("Administrador");
        System.out.println("**********************************");
        System.out.println("Ingrese una opcion");
        System.out.println("");
        System.out.println("1. Agreagar un nuevo Jefe");
        System.out.println("2. Ver lista de empleados");
        int selection;
        selection = Integer.parseInt(br.readLine());
        switch (selection) {
            case 1:
                hiredEmployees[count] = createBoss();
                count++;
                editFields();
                break;
            case 2:
                printEmployeeList();
                editFields();
                break;
            default:
                System.out.println("Esta es una seleccion incorrecta.");
                editFields();
                break;
        }
        System.out.println("**********************************");

    }

    public Employees createBoss() throws IOException {
        Boss boss = new Boss();
        System.out.println("Ingrese el nombre del nuevo Jefe");
        String name = br.readLine();
        boss.setName(name);
        System.out.println("Ingrese el ID");
        String id = br.readLine();
        boss.setID(id);
        System.out.println("Ingrese la direccion");
        String addr = br.readLine();
        boss.setAdress(addr);
        System.out.println("Ingrese el numero de telefono");
        String phoneNum = br.readLine();
        boss.setPhoneNumber(phoneNum);
        System.out.println("Ingrese el correo electronico");
        String email = br.readLine();
        boss.setEmail(email);
        System.out.println("Ingrese el salario mensual");
        int salary = Integer.parseInt(br.readLine());
        boss.setBossSalary(salary);

        return boss;
    }

    private void printEmployeeList() {
        System.out.println("tes");
        for (int i = 0; i < 15; i++) {
            System.out.println("Nombre: " + hiredEmployees[i].getName());
            System.out.println("ID: " + hiredEmployees[i].getID());
            System.out.println("Direccion: " + hiredEmployees[i].getAdress());
            System.out.println("Numero de telefono: " + hiredEmployees[i].getPhoneNumber());
        }
        System.out.println("test1");
    }
}
