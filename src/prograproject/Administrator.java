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
        System.out.println("1. Insertar nuevo Empleado");
        System.out.println("2. Eliminar Empleado");
        System.out.println("3. Buscar Empleado");
        System.out.println("4. Modificar Empleado");
        System.out.println("5. Ver lista de Empleados");
        System.out.println("6. Salir");              // aqui se debe agregar los valores que faltan en la descripcion del proyecto
        String selec = br.readLine();
        switch (selec) {
            case "1":
                addNewEmployee();
                break;
            case "2":
                printEmployeelist();
                editFields();
            case "3":
                searchEmployee();
                editFields();
                break;
            case "4":

                break;
            case "5":

                break;
            case "6":
                logOut();
                break;
            default:
                System.out.println("Los valores ingresados no son correctos");
                editFields();
        }
    }

    private void addNewEmployee() throws IOException {
        Employees emp = new Employees();
        System.out.println("Módulo agregar nuevo empleado");
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
                createdEmployess[j] = emp.hiredEmployees[j];
                j++;
                editFields();
                break;
            case "3":
                createdEmployess[j] = addNewCleaningAttend();
                createdEmployess[j] = emp.hiredEmployees[j];
                j++;
                editFields();
                break;
            case "4":
                createdEmployess[j] = addNewOrganizer();
                createdEmployess[j] = emp.hiredEmployees[j];
                j++;
                editFields();
                break;
            case "5":
                createdEmployess[j] = addNewSecretary();
                createdEmployess[j] = emp.hiredEmployees[j];
                j++;
                editFields();
                break;
            case "6":
                createdEmployess[j] = addNewSeller();
                createdEmployess[j] = emp.hiredEmployees[j];
                j++;
                editFields();
                break;
            default:
                System.out.println("Los valores ingresados no son correctos");
                addNewEmployee();
        }
    }

    private Employees addNewBoss() throws IOException {
        Employees boss = new Boss(400000);
        System.out.println("Ingrese el nombre del nuevo Jefe(a)");
        String name = br.readLine();
        boss.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine();
        boss.setID(id);
        System.out.println("Ingrese la contraseña");
        String pass = br.readLine();
        boss.setPassword(pass);
        System.out.println("Ingrese la dirección");
        String addr = br.readLine();
        boss.setAdress(addr);
        System.out.println("Ingrese el número de teléfono");
        String phoneNum = br.readLine();
        boss.setPhoneNumber(phoneNum);
        System.out.println("Jefe creado con éxito");

        return boss;
    }

    private Employees addNewCashier() throws IOException {
        Employees cashier = new Cashier(224000);
        System.out.println("Ingrese el nombre del nuevo Cajero(a)");
        String name = br.readLine();
        cashier.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine();
        cashier.setID(id);
        System.out.println("Ingrese la contraseña");
        String pass = br.readLine();
        cashier.setPassword(pass);
        System.out.println("Ingrese la dirección");
        String addr = br.readLine();
        cashier.setAdress(addr);
        System.out.println("Ingrese el número de teléfono");
        String phoneNum = br.readLine();
        cashier.setPhoneNumber(phoneNum);
        System.out.println("Cajero/a creado/a con éxito");
        return cashier;

    }

    private Employees addNewCleaningAttend() throws IOException {
        Employees cleaningAtt = new CleaningAttendant(200000);
        System.out.println("Ingrese el nombre del nuevo Miscelaneo(a)");
        String name = br.readLine();
        cleaningAtt.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine();
        cleaningAtt.setID(id);
        System.out.println("Ingrese la contraseña");
        String pass = br.readLine();
        cleaningAtt.setPassword(pass);
        System.out.println("Ingrese la dirección");
        String addr = br.readLine();
        cleaningAtt.setAdress(addr);
        System.out.println("Ingrese el número de teléfono");
        String phoneNum = br.readLine();
        cleaningAtt.setPhoneNumber(phoneNum);
        System.out.println("Miscelaneo creado con éxito");
        return cleaningAtt;

    }

    private Employees addNewOrganizer() throws IOException {
        Employees organizer = new Organizer(244000);
        System.out.println("Ingrese el nombre del nuevo Organizador(a)");
        String name = br.readLine();
        organizer.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine();
        organizer.setID(id);
        System.out.println("Ingrese la contraseña");
        String pass = br.readLine();
        organizer.setPassword(pass);
        System.out.println("Ingrese la dirección");
        String addr = br.readLine();
        organizer.setAdress(addr);
        System.out.println("Ingrese el número de teléfono");
        String phoneNum = br.readLine();
        organizer.setPhoneNumber(phoneNum);
        System.out.println("Organizador creado con éxito");
        return organizer;
    }

    private Employees addNewSecretary() throws IOException {
        Employees secretary = new Secretary(316800);
        System.out.println("Ingrese el nombre del nuevo Secretario(a)");
        String name = br.readLine();
        secretary.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine();
        secretary.setID(id);
        System.out.println("Ingrese la contraseña");
        String pass = br.readLine();
        secretary.setPassword(pass);
        System.out.println("Ingrese la dirección");
        String addr = br.readLine();
        secretary.setAdress(addr);
        System.out.println("Ingrese el número de teléfono");
        String phoneNum = br.readLine();
        secretary.setPhoneNumber(phoneNum);
        System.out.println("Secretario(a) creado con éxito");
        return secretary;
    }

    private Employees addNewSeller() throws IOException {
        Employees seller = new Seller(264000);
        System.out.println("Ingrese el nombre del nuevo Vendedor(a)");
        String name = br.readLine();
        seller.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine();
        seller.setID(id);
        System.out.println("Ingrese la contraseña");
        String pass = br.readLine();
        seller.setPassword(pass);
        System.out.println("Ingrese la dirección");
        String addr = br.readLine();
        seller.setAdress(addr);
        System.out.println("Ingrese el número de teléfono");
        String phoneNum = br.readLine();
        seller.setPhoneNumber(phoneNum);
        System.out.println("Vendedor(a) creado con éxito");
        return seller;
    }

    private void logOut() {
        try {
            System.out.println("Cerrando Sesión...");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.err.println("Hubo un error.");
        }
    }

    private void printEmployeelist() throws IOException {
        if (createdEmployess[0] == (null)) {
            System.out.println("La lista esta vacía");
            editFields();
        } else {
            for (int i = 0; i < j; i++) {
                System.out.println("Posición : " + createdEmployess[i].getClass().getSimpleName());
                System.out.println("Nombre: " + createdEmployess[i].getName());
                System.out.println("ID: " + createdEmployess[i].getID());
                System.out.println("Dirección: " + createdEmployess[i].getAdress());
                System.out.println("# de teléfono: " + createdEmployess[i].getPhoneNumber());
                System.out.println("***********************\n");
            }

        }
    }

    private void searchEmployee() throws IOException {
        System.out.println("Módulo buscar Empleado");
        System.out.println("***********************\n");
        System.out.println("Ingrese el ID del empleado");
        String id = br.readLine();
        for (int i = 0; i < j; i++) {
            if (id.equals(createdEmployess[i].getID())) {
                System.out.println("Nombre: " + createdEmployess[i].getName());
                System.out.println("ID: " + createdEmployess[i].getID());
            } else {
                System.out.println("Este Empleado no existe");
                searchEmployee();
            }
 
        }
    }
}
