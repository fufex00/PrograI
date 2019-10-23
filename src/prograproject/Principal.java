package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Administrator admin = new Administrator("admin", "pass1");
    public static Boss boss = new Boss();
    public static Employees[] employeeData = new Employees[30];
    public static int counter = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("**********************************");
        System.out.println("*   Bienvenido a la Verduleria   *");
        System.out.println("**********************************");
        System.out.println("");
        login();
    }

    public static void mainMenu() throws IOException {
    }

    public static void login() throws IOException {
        System.out.println("Ingrese su ID: ");
        String user = br.readLine();
        System.out.println("Ingrese su contraseña");
        String pass = br.readLine();

        verifyLogin(user, pass);
    }

    private static void verifyLogin(String user, String password) throws IOException {

        if ((admin.getUser().equals(user)) && (admin.getPassword().equals(password))) {
            admin.editFields();
            login();
        }
        for (int i = 0; i < counter; i++) {
            if ((employeeData[i].getID().equals(user) && employeeData[i].
                    getPassword().equals(password))) {
                System.out.println("Eureka");
                boss.Hiring();
            }

        }

    }

    public int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Principal.counter = counter;
    }

    public static void sumCounter() {
        counter++;
    }

    public void printPositionTable() {
    }

    public void vacations() {
    }

    public void clockInClockOut() {
    }

    public void printPayrollTable() {
    }
}
