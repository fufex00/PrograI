package prograproject;

public class Seller extends Employees {

    private int soldProducts;

    private int bonus;

    private double quantitySold;

    private double sellerSalary;

    public Seller(int soldProducts, int bonus, double quantitySold) {
        this.soldProducts = soldProducts;
        this.bonus = bonus;
        this.quantitySold = quantitySold;
    }

    public Seller(int soldProducts, int bonus, double quantitySold, String name,
            String ID, String adress, String phoneNumber, int workedHours,
            String email, Employees[] hiredEmployees, WorkingSchedule[] workedHour) {
        super(name, ID, adress, phoneNumber, workedHours, email, hiredEmployees,
                workedHour);
        this.soldProducts = soldProducts;
        this.bonus = bonus;
        this.quantitySold = quantitySold;
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
