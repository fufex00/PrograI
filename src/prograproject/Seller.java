package prograproject;

public class Seller extends Employees {

    private int bonus;
    private int soldProducts;
    private double sellerSalary;
    private double quantitySold;

    public Seller(double sellerSalary) {
        this.sellerSalary = sellerSalary;
    }

    public Seller(int soldProducts, int bonus, double quantitySold, double sellerSalary) {
        this.soldProducts = soldProducts;
        this.bonus = bonus;
        this.quantitySold = quantitySold;
        this.sellerSalary = sellerSalary;
    }

    public Seller(int soldProducts, int bonus, double quantitySold, double sellerSalary, String name, String ID, String adress, String phoneNumber, int workedHours, String email, String password, Double salary) {
        super(name, ID, adress, phoneNumber, workedHours, email, password, salary);
        this.soldProducts = soldProducts;
        this.bonus = bonus;
        this.quantitySold = quantitySold;
        this.sellerSalary = sellerSalary;
    }

    public Seller(int soldProducts, int bonus, double quantitySold, double sellerSalary, String name) {
        super(name);
        this.soldProducts = soldProducts;
        this.bonus = bonus;
        this.quantitySold = quantitySold;
        this.sellerSalary = sellerSalary;
    }

    public Seller(String name, String ID, String adress, String phoneNumber, int workedHours, String email, String password, Double salary, Double allDeductions) {
        super(name, ID, adress, phoneNumber, workedHours, email, password, salary, allDeductions);
    }

    
    
    public Seller() {
    }

    /**
     * @return the soldProducts
     */
    public int getSoldProducts() {
        return soldProducts;
    }

    /**
     * @param soldProducts the soldProducts to set
     */
    public void setSoldProducts(int soldProducts) {
        this.soldProducts = soldProducts;
    }

    /**
     * @return the bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the quantitySold
     */
    public double getQuantitySold() {
        return quantitySold;
    }

    /**
     * @param quantitySold the quantitySold to set
     */
    public void setQuantitySold(double quantitySold) {
        this.quantitySold = quantitySold;
    }

    /**
     * @return the sellerSalary
     */
    public double getSellerSalary() {
        return sellerSalary;
    }

    /**
     * @param sellerSalary the sellerSalary to set
     */
    public void setSellerSalary(double sellerSalary) {
        this.sellerSalary = sellerSalary;
    }
}
