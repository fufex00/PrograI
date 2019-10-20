package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JSHumanResources {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("**********************************");
        System.out.println("*   Bienvenido a la Verduleria   *");
        System.out.println("**********************************");
        System.out.println("");
        login();

    }

    public static void mainMenu() throws IOException {
    }

    private static void login() throws IOException {
        System.out.println("Ingrese su ID: ");
        String user = br.readLine();        
        System.out.println("Ingrese su contrasenia");                           //insertar la enie que falta
        String pass = br.readLine();
        
        verifyLogin(user, pass);
    }

    private static void verifyLogin(String user, String password) throws IOException {
        
        Administrator admin = new Administrator("admin", "pass1");
        if ((admin.getUser().equals(user)) && (admin.getPassword().equals(password))) {
            admin.editFields();
            login();
        }
        
        
        
    }

    public void printPositionTable() {
    }

    public void loadInfo() {
    }

    public void vacations() {
    }

    public void clockInClockOut() {
    }

    public void printPayrollTable() {
    }
}
