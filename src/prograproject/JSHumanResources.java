package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JSHumanResources {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("**********************************");
        System.out.println("* Bienvenido a la Verduleria J&S *");
        System.out.println("**********************************");
        System.out.println("");
        login();

    }

    static public void login() throws IOException {
        Administrator admin = new Administrator("admin", "pass1");
        System.out.println("Ingrese su ID");
        String user = br.readLine();
        System.out.println("Ingrese su contraseña ");
        String pass = br.readLine();
        
        if ((user.equals(admin.getUser())) && ( pass.equals(admin.getPassword()))) {
            hiring();
        } else {
            System.out.println("El usuario/contraseña es incorrecto");
        }

    }

    static public void hiring() {
        System.out.println("Test");
    
    }

    public void mainMenu() {
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
