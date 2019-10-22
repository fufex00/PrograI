package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Administrator extends Employees {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String user;
    private String password;
    public Employees createdEmployess[] = new Employees[20];
    public int j = 0;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public Administrator() {
    }

    public Administrator(String user, String password) {
        this.user = user;
        this.password = password;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public void editFields() throws IOException {
        System.out.println("Administrador");
        System.out.println("***********************\n");
        System.out.println("1. Agregar nuevo Empleado");
        System.out.println("2. Ver lista de Empleados");
        System.out.println("n. Salir");              // aqui se debe agregar los valores que faltan en la descripcion del proyecto
        String selec = br.readLine();
        switch (selec) {
            case "1":
                addNewEmployee();
                break;
            case "2":
                printEmployeelist();
                editFields();
            case "10":
                logOut();
                break;
            default:
                throw new AssertionError();
        }
    }

    private void addNewEmployee() throws IOException {
        Employees emp = new Employees();
        System.out.println("Modulo agregar nuevo empleado");
        System.out.println("***********************\n");
        System.out.println("1. Agregar un nuevo Jefe/a");
        System.out.println("2. Agregar un nuevo Cajero/a");
        System.out.println("3. Agregar un nuevo Miscelaneo/a");
        System.out.println("4. Agregar un nuevo Organizador/a");
        System.out.println("5. Agregar un nuevo Secretario/a");
        System.out.println("6. Agregar un nuevo Vendedor/a");
        String selec = br.readLine();
        switch (selec) {
            case "1":
                emp.hiredEmployees[j] = addNewBoss();
                createdEmployess[j] = emp.hiredEmployees[j];
                j++;
                editFields();
                break;
            case "2":
                createdEmployess[j] = addNewCashier();
                emp.hiredEmployees[j] = emp.hiredEmployees[j];
                j++;
                editFields();
                break;
            case "3":
                createdEmployess[j] = addNewCleaningAttend();
                emp.hiredEmployees[j] = emp.hiredEmployees[j];
                j++;
                editFields();
                break;
            case "4":
                createdEmployess[j] = addNewBoss();
                j++;
                break;
            case "5":
                createdEmployess[j] = addNewBoss();
                j++;
                break;
            case "6":
                createdEmployess[j] = addNewBoss();
                j++;
                break;
            default:
                throw new AssertionError();
        }
    }

    private Employees addNewBoss() throws IOException {
        Employees boss = new Boss(400000);
        System.out.println("Ingrese el nombre del nuevo Jefe");
        String name = br.readLine();
        boss.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine();
        boss.setID(id);
        System.out.println("Ingrese la contrasenia");
        String pass = br.readLine();
        boss.setPassword(pass);
        System.out.println("Ingrese la direccion");
        String addr = br.readLine();
        boss.setAdress(addr);
        System.out.println("Ingrese el numero de telefono");
        String phoneNum = br.readLine();
        boss.setPhoneNumber(phoneNum);
        System.out.println("Jefe creado con exito");

        return boss;
    }

    private Employees addNewCashier() throws IOException {
        Employees cashier = new Cashier(360000);
        System.out.println("Ingrese el nombre del nuevo Cajero");
        String name = br.readLine();
        cashier.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine();
        cashier.setID(id);
        System.out.println("Ingrese la contrasenia");
        String pass = br.readLine();
        cashier.setPassword(pass);
        System.out.println("Ingrese la direccion");
        String addr = br.readLine();
        cashier.setAdress(addr);
        System.out.println("Ingrese el numero de telefono");
        String phoneNum = br.readLine();
        cashier.setPhoneNumber(phoneNum);
        System.out.println("Cajero/a creado/a con exito");
        return cashier;

    }

    private void printEmployeelist() throws IOException {
        if (createdEmployess[0] == (null)) {
            System.out.println("La lista esta vacia");
            editFields();
        } else {
            for (int i = 0; i < j; i++) {
                System.out.println("Posicion : " + createdEmployess[i].getClass().getSimpleName());
                System.out.println("Nombre: " + createdEmployess[i].getName());
                System.out.println("ID: " + createdEmployess[i].getID());
                System.out.println("Direccion: " + createdEmployess[i].getAdress());
                System.out.println("# de telefono: " + createdEmployess[i].getPhoneNumber());
                System.out.println("***********************\n");
            }

        }
    }

    private void logOut() {
        try {
            System.out.println("Cerrando Sesion...");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.err.println("Hubo un error.");
        }
    }

    private Employees addNewCleaningAttend() throws IOException {
        Employees cleaningAtt = new CleaningAttendant(250000);
        System.out.println("Ingrese el nombre del nuevo Miscelaneo");
        String name = br.readLine();
        cleaningAtt.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine();
        cleaningAtt.setID(id);
        System.out.println("Ingrese la contrasenia");
        String pass = br.readLine();
        cleaningAtt.setPassword(pass);
        System.out.println("Ingrese la direccion");
        String addr = br.readLine();
        cleaningAtt.setAdress(addr);
        System.out.println("Ingrese el numero de telefono");
        String phoneNum = br.readLine();
        cleaningAtt.setPhoneNumber(phoneNum);
        System.out.println("Miscelaneo creado con exito");

        return cleaningAtt;

    }

}
