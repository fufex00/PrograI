package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    public static int counter = 0;
    public static int[] workedhours = new int[30];
    public static Administrator admin = new Administrator("admin", "pass1");
    public static Boss boss = new Boss();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Employees emp = new Employees();
    public static Employees[] employeeData = new Employees[30];
    
//Ventana principal de la verdulería
    public static void main(String[] args) throws IOException {
        System.out.println("**********************************");
        System.out.println("*   Bienvenido a la Verdulería   *");
        System.out.println("**********************************");
        System.out.println("");
        login();
    }
    
//Método que recibe los credenciales de los empleados
    public static void login() throws IOException {
        System.out.println("Ingrese su ID: ");
        String user = br.readLine();
        if (user.equals("exit")) {
            System.exit(0);
        }
        System.out.println("Ingrese su contraseña");
        String pass = br.readLine().toLowerCase();

        verifyLogin(user, pass);
    }
    
//Este método se encarga de designar qué tipo de Empleado es para ir a su respectivo módulo.
    private static void verifyLogin(String user, String password) throws IOException {
        if (employeeData != null) {
            if ((admin.getUser().equals(user)) && (admin.getPassword().equals(password))) {
                admin.editFields();
            }
            for (int i = 0; i < counter; i++) {
                if ((employeeData[i].getID().equals(user) && employeeData[i].
                        getPassword().equals(password)) && employeeData[i].getClass()
                        .getSimpleName().equals("Boss")) {
                    boss.hiring();
                } else {
                    if ((employeeData[i].getID().equals(user) && employeeData[i].
                            getPassword().equals(password))) {
                        emp.employeeMenu(user, password);
                    }
                }
            }
        }
        System.out.println("Datos incorrectos y/o no existen trabajadores con estos credenciales");
        login();
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

    public static void decreaseCounter() {
        counter--;
    }
}
