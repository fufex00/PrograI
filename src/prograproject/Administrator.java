package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Administrator extends Employees {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public Principal data = new Principal();

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
        System.out.println("7. Precargar datos");
        System.out.println("6. Salir");
        String selec = br.readLine();
        switch (selec) {
            case "1":
                addNewEmployee();
                editFields();
                break;
            case "2":
                removeEmployee();
                editFields();
                break;
            case "3":
                searchEmployee();
                editFields();
                break;
            case "4":
                modifyEmployee();
                editFields();
                break;
            case "5":
                printEmployeelist();
                editFields();
                break;
            case "6":
                try {
                    System.out.println("Cerrando Sesión...");
                    Thread.sleep(500);
                    Principal.login();
                } catch (InterruptedException ex) {
                    System.err.println("Hubo un error.");
                }
                break;
            case "7":
                preLoad();
                editFields();
                break;
            default:
                System.out.println("Los valores ingresados no son correctos");
                editFields();
        }
    }

    private void addNewEmployee() throws IOException {
        System.out.println("Módulo agregar nuevo empleado");
        System.out.println("***********************\n");
        System.out.println("1. Agregar un nuevo Jefe/a");
        System.out.println("2. Agregar un nuevo Cajero/a");
        System.out.println("3. Agregar un nuevo Miscelaneo/a");
        System.out.println("4. Agregar un nuevo Organizador/a");
        System.out.println("5. Agregar un nuevo Secretario/a");
        System.out.println("6. Agregar un nuevo Vendedor/a");
        System.out.println("7. Regresar");
        String selec = br.readLine();
        switch (selec) {
            case "1":
                Principal.employeeData[data.getCounter()] = addNewBoss();
                Principal.sumCounter();
                editFields();
                break;
            case "2":
                Principal.employeeData[data.getCounter()] = addNewCashier();
                Principal.sumCounter();
                editFields();
                break;
            case "3":
                Principal.employeeData[data.getCounter()] = addNewCleaningAttend();
                Principal.sumCounter();
                editFields();
                break;
            case "4":
                Principal.employeeData[data.getCounter()] = addNewOrganizer();
                Principal.sumCounter();
                editFields();
                break;
            case "5":
                Principal.employeeData[data.getCounter()] = addNewSecretary();
                Principal.sumCounter();
                editFields();
                break;
            case "6":
                Principal.employeeData[data.getCounter()] = addNewSeller();
                Principal.sumCounter();
                editFields();
                break;
            case "7":
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

    public Employees addNewCashier() throws IOException {
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

    public Employees addNewCleaningAttend() throws IOException {
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

    public Employees addNewOrganizer() throws IOException {
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

    public Employees addNewSecretary() throws IOException {
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

    public Employees addNewSeller() throws IOException {
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

    private void removeEmployee() throws IOException {
        System.out.println("Módulo de Eliminar Empleado");
        System.out.println("****************************\n");
        System.out.println("Ingrese el ID del empleado");
        String id = br.readLine();
        if (Principal.employeeData[0] != null) {
            System.out.println("Ingrese el ID del empleado");
            for (int i = 0; i < data.getCounter() && Principal.employeeData[i] != null; i++) {
                if (id.equals(Principal.employeeData[i].getID())) {
                    Principal.employeeData[i] = null;
                    System.out.println("El empleado fue eliminado.");
                    editFields();
                } else {
                    System.out.println("Este Empleado no existe");
                    searchEmployee();
                }
            }
        } else {
            System.out.println("La lista de empleados esta vacia.");
            editFields();
        }

    }

    private void searchEmployee() throws IOException {
        System.out.println("Módulo buscar Empleado");
        System.out.println("***********************\n");
        System.out.println("Ingrese el ID del empleado");
        String id = br.readLine();
        for (int i = 0; i < data.getCounter(); i++) {
            if (id.equals(Principal.employeeData[i].getID())) {
                System.out.println("Nombre: " + Principal.employeeData[i].getName());
                System.out.println("ID: " + Principal.employeeData[i].getID());
                editFields();
            }
        }
        System.out.println("El empleado no existe");

    }

    private void modifyEmployee() throws IOException {
        System.out.println("Módulo de Modificar Empleado");
        System.out.println("*****************************\n");
        System.out.println("Ingrese el ID del empleado");
        String entered = br.readLine();
        for (int i = 0; i < data.getCounter() && Principal.employeeData[i] != null; i++) {
            if (entered.equals(Principal.employeeData[i].getID())) {
                System.out.println("¿Qué datos desea modificar del empleado?\n");
                System.out.println("1. Nombre");
                System.out.println("2. ID");
                System.out.println("3. Dirección");
                System.out.println("4. # de teléfono");
                System.out.println("5. Correo Electronico");
                System.out.println("6. Contrasenia");
                System.out.println("7. Cancelar");
                String selec = br.readLine();
                switch (selec) {
                    case "1":
                        System.out.println("Ingrese el nuevo nombre");
                        String name = br.readLine();
                        Principal.employeeData[i].setName(name);
                        System.out.println("Hecho!");
                        i = data.getCounter();
                        editFields();
                        break;
                    case "2":
                        System.out.println("Ingrese el nuevo ID");
                        String id = br.readLine();
                        Principal.employeeData[i].setID(id);
                        System.out.println("Hecho!");
                        i = data.getCounter();
                        editFields();
                        break;
                    case "3":
                        System.out.println("Ingrese la nueva dirección");
                        String dir = br.readLine();
                        Principal.employeeData[i].setAdress(dir);
                        System.out.println("Hecho!");
                        i = data.getCounter();
                        editFields();
                        break;
                    case "4":
                        System.out.println("Ingrese el nuevo # de telefono");
                        String phoneN = br.readLine();
                        Principal.employeeData[i].setPhoneNumber(phoneN);
                        System.out.println("Hecho!");
                        i = data.getCounter();
                        editFields();
                        break;
                    case "5":
                        System.out.println("Ingrese el nuevo e-Mail ");
                        String email = br.readLine();
                        Principal.employeeData[i].setEmail(email);
                        System.out.println("Hecho!");
                        i = data.getCounter();
                        editFields();
                        break;
                    case "6":
                        System.out.println("Ingrese la nueva contrasenia");
                        String pass = br.readLine();
                        Principal.employeeData[i].setPassword(pass);
                        System.out.println("Hecho!");
                        i = data.getCounter();
                        editFields();
                        break;
                    case "7":
                        i = data.getCounter();
                        editFields();
                        break;
                    default:
                        System.out.println("Ingrese un valor adecuado");
                        modifyEmployee();
                }
            }
        }
        System.out.println("El usuario no existe");
    }

    private void printEmployeelist() throws IOException {
        if (Principal.employeeData[0] == (null)) {
            System.out.println("La lista esta vacía");
            editFields();
        } else {
            for (int i = 0; i < data.getCounter() && Principal.employeeData[i] != null; i++) {
                System.out.println("***********************");
                System.out.println("Posición : " + Principal.employeeData[i].getClass().getSimpleName());
                System.out.println("Nombre: " + Principal.employeeData[i].getName());
                System.out.println("ID: " + Principal.employeeData[i].getID());
                System.out.println("Dirección: " + Principal.employeeData[i].getAdress());
                System.out.println("# de teléfono: " + Principal.employeeData[i].getPhoneNumber());
                System.out.println("***********************\n");
            }
        }
    }

    private void preLoad() {
        Employees boss = new Employees("Steve", "123", "200 noroeste de la municipalidad de Golfito", "86057093", 160, "456", "456", 900000.00);
        Principal.employeeData[0] = boss;
        Principal.employeeData[0].setNetSalary();
        System.out.println(Principal.employeeData[0].getSalary());
    }

}
