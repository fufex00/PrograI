package prograproject;

public class Boss extends Employees implements HireEmployees {

    private double bossSalary;

    private double bonus;
    private String password;

    public Boss() {
    }

    public Boss(double bossSalary, double bonus) {
        this.bossSalary = bossSalary;
        this.bonus = bonus;
    }

    public Boss(double bossSalary) {
        this.bossSalary = bossSalary;
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

    @Override
    public void Hiring() {

    }

}
