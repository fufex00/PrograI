package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JSHumanResources {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("**********************************");
        System.out.println("* Bienvenido a la Verduleria J&B *");
        System.out.println("**********************************");
        System.out.println("");
        login();

    }

    static public void login() throws IOException {
        File loginCredentials = new File("loginData.txt");
        String filepath = "loginData.txt";

        System.out.println("Ingrese su ID");
        String user = br.readLine();
        System.out.println("Ingrese su contraseña ");
        String pass = br.readLine();
        verifyLogin(user, pass, filepath);

    }

    private static void verifyLogin(String user, String password, String filepath) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File(filepath));
        boolean found = false;
        String tempUserName = "";
        String tempPassword = "";
        try {
            while (sc.hasNext() && !found) {
                sc.useDelimiter("[,\n]");
                tempUserName = sc.next();
                tempPassword = sc.next();

                if (tempUserName.trim().equals(user.trim()) && tempPassword.trim().equals(password.trim())) {
                    found = true;
                    Employees admin = new Employees();
                    admin.editFields();
                    login();

                } else {
                    System.out.println("Credenciales incorrectos. Pruebe otra vez.");
                    login();
                }
                sc.close();
            }
        } catch (Exception e) {
        }
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
