package prograproject;

public class Cashier extends Employees {

    private double cashierSalary;

    public Cashier() {
    }

    public Cashier(double cashierSalary) {
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
