package prograproject;

public class Cashier extends Employees {

    private double cashierSalary;

    public Cashier(double cashierSalary) {
        this.cashierSalary = cashierSalary;
    }

    public Cashier(double cashierSalary, String name, String ID, String adress, String phoneNumber, int workedHours, String email, String password, Double salary) {
        super(name, ID, adress, phoneNumber, workedHours, email, password, salary);
        this.cashierSalary = cashierSalary;
    }

    public Cashier(String name, String ID, String adress, String phoneNumber, int workedHours, String email, String password, Double salary, Double allDeductions) {
        super(name, ID, adress, phoneNumber, workedHours, email, password, salary, allDeductions);
    }
    
    public Cashier(double cashierSalary, String name) {
        super(name);
        this.cashierSalary = cashierSalary;
    }


    /**
     * @return the cashierSalary
     */
    public double getCashierSalary() {
        return cashierSalary;
    }

    /**
     * @param cashierSalary the cashierSalary to set
     */
    public void setCashierSalary(double cashierSalary) {
        this.cashierSalary = cashierSalary;
    }
    
}
