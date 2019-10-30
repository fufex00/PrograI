package prograproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Administrator extends Employees {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public Principal data = new Principal();

    public int j = 0;
    public Employees createdEmployess[] = new Employees[20];
    private String password;
    private String user;

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
    @Override
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
//Este método funciona para mostrar las opciones posibles que se pueden realizar con los Empleados.
    public void editFields() throws IOException {
        System.out.println("Administrador");
        System.out.println("***********************\n");
        System.out.println("1. Insertar nuevo Empleado");
        System.out.println("2. Eliminar Empleado");
        System.out.println("3. Buscar Empleado");                               //Menú de Administrador que permite realizar acciones con los Empleados.
        System.out.println("4. Modificar Empleado");
        System.out.println("5. Ver lista de Empleados");
        System.out.println("6. Precargar datos");
        System.out.println("7. Salir");
        try {
            int selec = Integer.parseInt(br.readLine());
            switch (selec) {
                case 1:
                    addNewEmployee();
                    editFields();
                    break;
                case 2:
                    removeEmployee();
                    editFields();
                    break;
                case 3:
                    searchEmployee();
                    editFields();
                    break;
                case 4:
                    modifyEmployee();
                    editFields();
                    break;
                case 5:
                    printEmployeelist();
                    editFields();
                    break;
                case 6:
                    preLoad();
                    editFields();
                    break;
                case 7:
                    try {
                        System.out.println("Cerrando Sesión...");
                        Thread.sleep(500);                                      //Cierre de sesión principal.
                        Principal.login();
                    } catch (InterruptedException ex) {
                        System.err.println("Hubo un error.");
                    }
                    break;
                default:
                    System.out.println("Los valores ingresados no son correctos");
                    editFields();
            }
        } catch (IOException | NumberFormatException a) {
            System.out.println("Los valores ingresados no son correctos 111");
        }
    }
    
//Módulo que muestra un menú para agregar un nuevo Empleado.
    private void addNewEmployee() throws IOException {
        System.out.println("Módulo agregar nuevo Empleado");
        System.out.println("***********************\n");
        System.out.println("1. Agregar un nuevo Jefe(a)");
        System.out.println("2. Agregar un nuevo Cajero(a)");
        System.out.println("3. Agregar un nuevo Misceláneo(a)");
        System.out.println("4. Agregar un nuevo Organizador(a)");               //Tipos de Empleados que se pueden agregar.
        System.out.println("5. Agregar un nuevo Secretario(a)");
        System.out.println("6. Agregar un nuevo Vendedor(a)");
        System.out.println("7. Regresar");
        int selec;
        try {
            selec = Integer.parseInt(br.readLine());
            switch (selec) {
                case 1:
                    Principal.employeeData[data.getCounter()] = addNewBoss();
                    Principal.sumCounter();
                    editFields();
                    break;
                case 2:
                    Principal.employeeData[data.getCounter()] = addNewCashier();
                    Principal.sumCounter();
                    editFields();
                    break;
                case 3:
                    Principal.employeeData[data.getCounter()] = addNewCleaningAttend();
                    Principal.sumCounter();
                    editFields();
                    break;
                case 4:
                    Principal.employeeData[data.getCounter()] = addNewOrganizer();
                    Principal.sumCounter();
                    editFields();
                    break;
                case 5:
                    Principal.employeeData[data.getCounter()] = addNewSecretary();
                    Principal.sumCounter();
                    editFields();
                    break;
                case 6:
                    Principal.employeeData[data.getCounter()] = addNewSeller();
                    Principal.sumCounter();
                    editFields();
                    break;
                case 7:
                    editFields();
                    break;
                default:
                    System.out.println("Los valores ingresados no son correctos");
                    addNewEmployee();
                    break;
            }
        } catch (NumberFormatException b) {
            System.out.println("Los valores ingresados no son correctos");
            addNewEmployee();
        }
    }
    
//Agregar Jefe.
    private Employees addNewBoss() throws IOException {
        Employees boss = new Boss(400000);
        System.out.println("Ingrese el nombre del nuevo Jefe(a)");
        String name = br.readLine();
        boss.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine().toLowerCase();
        while (verifyTakenUser(id)) {
            System.out.println("Este ID ya fue utilizado, ingrese otro: ");     //Ciclo para verificar la existencia de algún ID igual.
            id = br.readLine();
            verifyTakenUser(id);
        }
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
    
//Agregar Cajero.
    public Employees addNewCashier() throws IOException {
        Employees cashier = new Cashier(224000);
        System.out.println("Ingrese el nombre del nuevo Cajero(a)");
        String name = br.readLine();
        cashier.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine().toLowerCase();
        while (verifyTakenUser(id)) {
            System.out.println("Este ID ya fue utilizado, ingrese otro: ");     //Ciclo para verificar la existencia de algún ID igual.
            id = br.readLine();
            verifyTakenUser(id);
        }
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
        System.out.println("Cajero(a) creado(a) con éxito");
        return cashier;
    }
    
//Agregar Misceláneo.
    public Employees addNewCleaningAttend() throws IOException {
        Employees cleaningAtt = new CleaningAttendant(200000);
        System.out.println("Ingrese el nombre del nuevo Misceláneo(a)");
        String name = br.readLine();
        cleaningAtt.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine().toLowerCase();
        while (verifyTakenUser(id)) {
            System.out.println("Este ID ya fue utilizado, ingrese otro: ");     //Ciclo para verificar la existencia de algún ID igual.
            id = br.readLine();
            verifyTakenUser(id);
        }
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
        System.out.println("Misceláneo(a) creado(a) con éxito");
        return cleaningAtt;
    }
    
//Agregar Organizador.
    public Employees addNewOrganizer() throws IOException {
        Employees organizer = new Organizer(244000);
        System.out.println("Ingrese el nombre del nuevo Organizador(a)");       
        String name = br.readLine();
        organizer.setName(name);
        System.out.println("Digite el ID");
        String id = br.readLine().toLowerCase();
        while (verifyTakenUser(id)) {
            System.out.println("Este ID ya fue utilizado, ingrese otro: ");     //Ciclo para verificar la existencia de algún ID igual.
            id = br.readLine();
            verifyTakenUser(id);
        }
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
        System.out.println("Organizador(a) creado(a) con éxito");               
        return organizer;
    }
    
//Agregar Secretaria.
    public Employees addNewSecretary() throws IOException {
        Employees secretary = new Secretary(316800);
        System.out.println("Ingrese el nombre del nuevo Secretario(a)");        
        String name = br.readLine();
        secretary.setName(name);
        System.out.println("Digite el ID");                                     
        String id = br.readLine().toLowerCase();
        while (verifyTakenUser(id)) {
            System.out.println("Este ID ya fue utilizado, ingrese otro: ");     
            id = br.readLine();
            verifyTakenUser(id);
        }
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
        System.out.println("Secretario(a) creado(a) con éxito");                
        return secretary;
    }
    
//Agregar Vendedor.
    public Employees addNewSeller() throws IOException {
        Employees seller = new Seller(264000);
        System.out.println("Ingrese el nombre del nuevo Vendedor(a)");          //Recibe un nombre y le es asignado
        String name = br.readLine();
        seller.setName(name);
        System.out.println("Digite el ID");                                     //Recibe un ID y le es asignado
        String id = br.readLine().toLowerCase();
        while (verifyTakenUser(id)) {
            System.out.println("Este ID ya fue utilizado, ingrese otro: ");     //Ciclo para verificar la existencia de algún ID igual.
            id = br.readLine();
            verifyTakenUser(id);
        }
        seller.setID(id);
        System.out.println("Ingrese la contraseña");                            //Asigna contraseña
        String pass = br.readLine();
        seller.setPassword(pass);
        System.out.println("Ingrese la dirección");                             //Asigna dirección
        String addr = br.readLine();
        seller.setAdress(addr);
        System.out.println("Ingrese el número de teléfono");                    //Asigna Número de teléfono 
        String phoneNum = br.readLine();
        seller.setPhoneNumber(phoneNum);
        System.out.println("Vendedor(a) creado(a) con éxito");                  //Crea el Empleado con los datos registrados por el usuario.
        return seller;
    }
    
//Método que permite eliminar al Empleado.
    private void removeEmployee() throws IOException {
        if (Principal.employeeData[0] == null) {
            System.out.println("La lista está vacía");
        } else {
            try {
                System.out.println("Módulo de Eliminar Empleado");
                System.out.println("***********************\n");
                System.out.println("Ingrese el ID del Empleado o " + "\"s\" " + " para salir");
                String id = br.readLine().toLowerCase();
                if (id.equals("s")) {
                    editFields();
                } else {
                    for (int i = 0; i < data.getCounter(); i++) {
                        if (id.equals(Principal.employeeData[i].getID())) {
                            for (int a = i; a <= data.getCounter(); a++) {      //Este método permite desplazar las posiciones con valor hacía la
                                if (a == data.getCounter()) {                   //izquierda y la posición nula encontrada, es desplazada justo  
                                    Principal.employeeData[a] = null;           //después de las posiciones con valor y mostrando esta como vacía.
                                    System.out.println("Empleado eliminado con éxito\n");
                                    Principal.decreaseCounter();
                                    editFields();
                                } else {
                                    Principal.employeeData[a] = Principal.employeeData[a + 1];
                                }
                            }
                        }
                    }
                    System.out.println("El usuario no existe");
                }
            } catch (IOException c) {
                System.out.println("Los valores ingresados no son correctos");
                editFields();
            }
        }
    }
    
//Método que funciona para buscar a los  Empleados por medio de su ID.
    private void searchEmployee() throws IOException {
        if (Principal.employeeData[0] == null) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("Módulo buscar Empleado");
            System.out.println("***********************\n");
            System.out.println("Ingrese el ID del Empleado o " + "\"s\" " + " para salir");
            String id = br.readLine().toLowerCase();
            if (id.equals("s")) {
                editFields();
            } else {
                for (int i = 0; i < data.getCounter(); i++) {
                    if (id.equals(Principal.employeeData[i].getID())) {
                        System.out.println("Nombre: " + Principal.employeeData[i].getName());
                        System.out.println("ID: " + Principal.employeeData[i].getID());
                        editFields();
                    }
                }
                System.out.println("El Empleado no existe");
            }
        }
    }
    
//Método que permite modificar los datos del Empleado seleccionado.
    private void modifyEmployee() throws IOException {
        if (Principal.employeeData[0] == null) {
            System.out.println("La lista está vacía");
        } else {
            try {
                System.out.println("Módulo de Modificar Empleado");
                System.out.println("*****************************\n");
                System.out.println("Ingrese el ID del Empleado o " + "\"s\" " + " para salir");
                String entered = br.readLine().toLowerCase();
                if (entered.equals("s")) {
                    editFields();
                } else {
                    for (int i = 0; i < data.getCounter() && Principal.employeeData[i] != null; i++) {
                        if (entered.equals(Principal.employeeData[i].getID())) {
                            System.out.println("¿Qué datos desea modificar del Empleado?\n");
                            System.out.println("1. Nombre");
                            System.out.println("2. ID");
                            System.out.println("3. Dirección");
                            System.out.println("4. # de teléfono");
                            System.out.println("5. Correo Electrónico");        //Menú que muestra las modificaciones permitidas para el Empleado.
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
                                    editFields();
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nuevo ID");
                                    String id = br.readLine();
                                    Principal.employeeData[i].setID(id);
                                    System.out.println("Hecho!");
                                    i = data.getCounter();
                                    editFields();
                                    break;
                                case 3:
                                    System.out.println("Ingrese la nueva dirección");
                                    String dir = br.readLine();
                                    Principal.employeeData[i].setAdress(dir);
                                    System.out.println("Hecho!");
                                    i = data.getCounter();
                                    editFields();
                                    break;
                                case 4:
                                    System.out.println("Ingrese el nuevo # de teléfono");
                                    String phoneN = br.readLine();
                                    Principal.employeeData[i].setPhoneNumber(phoneN);
                                    System.out.println("Hecho!");
                                    i = data.getCounter();
                                    editFields();
                                    break;
                                case 5:
                                    System.out.println("Ingrese el nuevo e-Mail ");
                                    String email = br.readLine();
                                    Principal.employeeData[i].setEmail(email);
                                    System.out.println("Hecho!");
                                    i = data.getCounter();
                                    editFields();
                                    break;
                                case 6:
                                    System.out.println("Ingrese la nueva contraseña");
                                    String pass = br.readLine();
                                    Principal.employeeData[i].setPassword(pass);
                                    System.out.println("Hecho!");
                                    i = data.getCounter();
                                    editFields();
                                    break;
                                case 7:
                                    i = data.getCounter();
                                    editFields();
                                    break;
                                default:
                                    System.out.println("Ingrese un valor adecuado");
                                    modifyEmployee();
                                    break;
                            }
                        }
                    }
                    System.out.println("El usuario no existe");
                }
            } catch (IOException d) {
                System.out.println("Los valores ingresados no son correctos");
                editFields();
            }
        }
    }
    
//Método que imprime la lista de Empleados que se encuentren guardados o cargados.
    private void printEmployeelist() throws IOException {
        if (Principal.employeeData[0] == (null)) {
            System.out.println("La lista está vacía");
            editFields();
        } else {
            for (int i = 0; i < data.getCounter() && Principal.employeeData[i] != null; i++) {
                System.out.println("***********************");
                System.out.println("Posición: " + Principal.employeeData[i]
                        .getClass().getSimpleName());
                System.out.println("Nombre: " + Principal.employeeData[i].getName());
                System.out.println("ID: " + Principal.employeeData[i].getID());
                System.out.println("Dirección: " + Principal.employeeData[i]
                        .getAdress());
                System.out.println("# de teléfono: " + Principal.employeeData[i]
                        .getPhoneNumber());
                System.out.println("***********************\n");
            }
        }
    }
    
//Método que permite Precargar datos de Empleados ya guardados y mostrarlos en pantalla.
    public static void preLoad() {
        Employees boss = new Boss("Pepe", "123", "200 noroeste de la "
                + "municipalidad de Golfito", "86057093", 160, "pepeman@gmail.com",
                "456", 400000.00);
        Employees secre = new Secretary("Camila", "578", "Pavas, Heredia, Costa "
                + "Rica", "84759687", 120, "cami_24@hotmail.com", "911", 237600.00);
        Employees clean = new CleaningAttendant("Justin", "450", "Barrio Parroquial, "
                + "Golfito, Puntarenas, Costa "
                + "Rica", "87463758", 85, "jus_tin342@gmail.com", "424", 106250.00);
        Principal.employeeData[0] = boss;
        Principal.sumCounter();
        Principal.employeeData[1] = secre;
        Principal.sumCounter();
        Principal.employeeData[2] = clean;
        Principal.sumCounter();
        
        System.out.println("Empleados agregados.");
        
//        Principal.employeeData[0].setNetSalary();
//        System.out.println("salario total");
//        System.out.println(Principal.employeeData[0].getSalary());
    }
    
//Método para comparar que no existan dos ID iguales.
    public Boolean verifyTakenUser(String id) {
        for (int i = 0; i < data.getCounter(); i++) {
            if (id.equals(Principal.employeeData[i].getID())) {                 //Recorre el objeto donde están cargados los empleados
                return true;                                                    // y compara que el ID ingresado no exista.
            }
        }
        return false;
    }
}
