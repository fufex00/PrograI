package prograproject;

import java.io.IOException;

public class Boss extends Employees {

    Administrator ad = new Administrator();
    Employees empData = new Employees();
    public Principal data = new Principal();

    private double bonus;
    private double bossSalary;

    public Boss() {
    }

    public Boss(double bossSalary) {
        this.bossSalary = bossSalary;
    }

    public Boss(double bossSalary, double bonus) {
        this.bossSalary = bossSalary;
        this.bonus = bonus;
    }

    public Boss(String name, String ID, String address, String phoneNumber, int workedHours, String email, String password, Double salary) {
        super(name, ID, address, phoneNumber, workedHours, email, password, salary);
    }

    public Boss(String name, String ID, String adress, String phoneNumber, int workedHours, String email, String password, Double salary, Double allDeductions) {
        super(name, ID, adress, phoneNumber, workedHours, email, password, salary, allDeductions);
    }

    public Boss(double bossSalary, double bonus, String name) {
        super(name);
        this.bossSalary = bossSalary;
        this.bonus = bonus;
    }

    /**
     * @return the bossSalary
     */
    public double getBossSalary() {
        return bossSalary;
    }

    /**
     * @param bossSalary the bossSalary to set
     */
    public void setBossSalary(double bossSalary) {
        this.bossSalary = bossSalary;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

//Menú de Jefe, permite realizar funciones con los datos del Empleado.
    public void hiring() throws IOException {
        System.out.println("Módulo Jefe");
        System.out.println("***********************\n");
        System.out.println("1. Insertar nuevo Empleado");
        System.out.println("2. Eliminar Empleado");
        System.out.println("3. Buscar Empleado");
        System.out.println("4. Modificar Empleado");
        System.out.println("5. Ver lista de Empleados");
        System.out.println("6. Imprimir planilla");
        System.out.println("7. Salir");
        try {
            int select = Integer.parseInt(br.readLine());
            switch (select) {
                case 1:
                    addNewEmployee();
                    hiring();
                    break;
                case 2:
                    removeEmployee();
                    hiring();
                    break;
                case 3:
                    searchEmployee();
                    hiring();
                    break;
                case 4:
                    modifyEmployee();
                    hiring();
                    break;
                case 5:
                    printEmployeelist();
                    hiring();
                    break;
                case 6:
                    printPayroll();
                    hiring();
                    break;
                case 7:
                    try {
                        System.out.println("Cerrando Sesión...");
                        Thread.sleep(2000);
                        Principal.login();
                    } catch (InterruptedException ex) {
                        System.err.println("Hubo un error.");
                    }
                    break;
                default:
                    System.out.println("Los valores ingresados no son correctos,"
                            + " ingrese un valor numerico\n");
                    hiring();
                    break;
            }
        } catch (NumberFormatException f) {
            System.out.println("Los valores ingresados no son correctos\n");
            hiring();
        }
    }

//Método para añadir un nuevo Empleado.   
    private void addNewEmployee() throws IOException {
        try {
            System.out.println("Módulo agregar nuevo Empleado");
            System.out.println("***********************\n");
            System.out.println("1. Agregar un nuevo Cajero/a");//Tipos de
            System.out.println("2. Agregar un nuevo Misceláneo/a");//Empleados
            System.out.println("3. Agregar un nuevo Organizador/a");//que se pueden
            System.out.println("4. Agregar un nuevo Secretario/a");//agregar.
            System.out.println("5. Agregar un nuevo Vendedor/a");
            System.out.println("6. Regresar");
            int selec = Integer.parseInt(br.readLine());
            switch (selec) {
                case 1:
                    Principal.employeeData[data.getCounter()] = ad.addNewCashier();
                    Principal.sumCounter();
                    hiring();
                    break;
                case 2:
                    Principal.employeeData[data.getCounter()] = ad.addNewCleaningAttend();
                    Principal.sumCounter();
                    hiring();
                    break;
                case 3:
                    Principal.employeeData[data.getCounter()] = ad.addNewOrganizer();
                    Principal.sumCounter();
                    hiring();
                    break;
                case 4:
                    Principal.employeeData[data.getCounter()] = ad.addNewSecretary();
                    Principal.sumCounter();
                    hiring();
                    break;
                case 5:
                    Principal.employeeData[data.getCounter()] = ad.addNewSeller();
                    Principal.sumCounter();
                    hiring();
                    break;
                case 6:
                    hiring();
                    break;
                default:
                    System.out.println("Los valores ingresados no son correctos\n");
                    addNewEmployee();
                    break;
            }
        } catch (NumberFormatException g) {
            System.out.println("Los valores ingresados no son correctos\n");
            addNewEmployee();
        }
    }

//Eliminar a un Empleado.   
    public void removeEmployee() throws IOException {
        try {
            System.out.println("Módulo de Eliminar Empleado");
            System.out.println("***********************\n");
            System.out.println("Ingrese el ID del Empleado o " + "\"s\" " + " para salir");
            String id = br.readLine().toLowerCase();
            if (id.equals("s")) {
                hiring();
            } else {
                for (int i = 0; i < data.getCounter(); i++) {
                    System.out.println(Principal.employeeData[i].getClass().getSimpleName());
                    if (id.equals(Principal.employeeData[i].getID())) {
                        if (Principal.employeeData[i].getClass().getSimpleName().equals("Boss")) {
                            System.out.println("Este usuario no se puede eliminar");
                            hiring();
                        } else {

                            for (int a = i; a <= data.getCounter(); a++) {
                                if (a == data.getCounter()) {
                                    Principal.employeeData[a] = null;
                                    System.out.println("Empleado eliminado con éxito\n");
                                    Principal.decreaseCounter();
                                    hiring();
                                } else {
                                    Principal.employeeData[a] = Principal.employeeData[a + 1];
                                }
                            }
                        }
                    } else {

                    }
                }
                System.out.println("el usuario no existe\n");
            }
        } catch (IOException h) {
            System.out.println("Valores incorrectos, intente otra vez\n");
            hiring();
        }
    }

//Método para buscar Empleados por medio de su ID    
    private void searchEmployee() throws IOException {
        try {
            System.out.println("Módulo buscar Empleado");
            System.out.println("Ingrese el ID del Empleado o " + "\"s\" " + " para salir");
            String id = br.readLine().toLowerCase();
            if (id.equals("s")) {
                hiring();
            } else {
                for (int i = 0; i < data.getCounter(); i++) {
                    if (id.equals(Principal.employeeData[i].getID())) {
                        System.out.println("Nombre: " + Principal.employeeData[i].getName());
                        System.out.println("ID: " + Principal.employeeData[i].getID());
                        hiring();
                    }
                }
                System.out.println("El empleado no existe\n");
            }
        } catch (IOException i) {
            System.out.println("Valores incorrectos, intente otra vez\n");
            hiring();
        }
    }

//Método para modificar los datos de un Empleado.    
    private void modifyEmployee() throws IOException {
        try {
            System.out.println("Módulo de Modificar Empleado");
            System.out.println("*****************************\n");
            System.out.println("Ingrese el ID del Empleado o " + "\"s\" " + " para salir");
            String entered = br.readLine().toLowerCase();
            if (entered.equals("s")) {
                for (int i = 0; i < data.getCounter() && Principal.employeeData[i] != null; i++) {
                    if (entered.equals(Principal.employeeData[i].getID())) {
                        System.out.println("¿Qué datos desea modificar del empleado?\n");
                        System.out.println("1. Nombre");
                        System.out.println("2. ID");
                        System.out.println("3. Dirección");
                        System.out.println("4. # de teléfono");
                        System.out.println("5. Correo Electrónico");
                        System.out.println("6. Contraseña");
                        System.out.println("7. Cancelar");
                        int selec = Integer.parseInt(br.readLine());
                        switch (selec) {
                            case 1:
                                System.out.println("Ingrese el nuevo nombre");
                                String name = br.readLine();
                                Principal.employeeData[i].setName(name);
                                System.out.println("Hecho!");
                                i = data.getCounter();
                                hiring();
                                break;
                            case 2:
                                System.out.println("Ingrese el nuevo ID");
                                String id = br.readLine();
                                Principal.employeeData[i].setID(id);
                                System.out.println("Hecho!");
                                i = data.getCounter();
                                hiring();
                                break;
                            case 3:
                                System.out.println("Ingrese la nueva dirección");
                                String dir = br.readLine();
                                Principal.employeeData[i].setAdress(dir);
                                System.out.println("Hecho!");
                                i = data.getCounter();
                                hiring();
                                break;
                            case 4:
                                System.out.println("Ingrese el nuevo # de teléfono");
                                String phoneN = br.readLine();
                                Principal.employeeData[i].setPhoneNumber(phoneN);
                                System.out.println("Hecho!");
                                i = data.getCounter();
                                hiring();
                                break;
                            case 5:
                                System.out.println("Ingrese el nuevo e-Mail ");
                                String email = br.readLine();
                                Principal.employeeData[i].setEmail(email);
                                System.out.println("Hecho!");
                                i = data.getCounter();
                                hiring();
                                break;
                            case 6:
                                System.out.println("Ingrese la nueva contraseña");
                                String pass = br.readLine();
                                Principal.employeeData[i].setPassword(pass);
                                System.out.println("Hecho!");
                                i = data.getCounter();
                                hiring();
                                break;
                            case 7:
                                i = data.getCounter();
                                hiring();
                                break;
                            default:
                                System.out.println("Ingrese un valor adecuado\n");
                                modifyEmployee();
                        }
                    }
                }
            } else {
                System.out.println("El usuario no existe\n");
            }
        } catch (IOException j) {
            System.out.println("Valores incorrectos, intente otra vez\n");
            hiring();
        }
    }

//Imprimir una lista con los Empleados ya guardados o registrados.    
    public void printEmployeelist() throws IOException {

        for (int i = 0; i < data.getCounter(); i++) {
            System.out.println("Posición : " + Principal.employeeData[i].getClass().getSimpleName());
            System.out.println("Nombre: " + Principal.employeeData[i].getName());
            System.out.println("ID: " + Principal.employeeData[i].getID());
            System.out.println("Dirección: " + Principal.employeeData[i].getAdress());
            System.out.println("# de teléfono: " + Principal.employeeData[i].getPhoneNumber());
            System.out.println("***********************\n");
        }
    }

//Método que imprime la planilla de Empledos con sus datos y salario respectivos.   
    private void printPayroll() {
        for (int i = 0; i < data.getCounter(); i++) {
            System.out.println("Posición : " + Principal.employeeData[i].getClass().getSimpleName());
            System.out.println("Nombre: " + Principal.employeeData[i].getName());
            System.out.println("ID: " + Principal.employeeData[i].getID());
            System.out.println("Horas trabajadas: " + Principal.employeeData[i].getWorkedHours());
            showData(Integer.parseInt(Principal.employeeData[i].getID()), Principal.employeeData[i].getSalary(),
                    Principal.employeeData[i].getWorkedHours(), Principal.employeeData[i].getClass().getSimpleName());

            System.out.println("***********************\n");
        }
    }
}
