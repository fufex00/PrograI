package prograproject;

public class Deductions {

    private String typeOfDeduction;

    private double deductionAmount;

    public void makeDeductions() {
    }

    public Deductions() {
    }

    public Deductions(String typeOfDeduction, double deductionAmount) {
        this.typeOfDeduction = typeOfDeduction;
        this.deductionAmount = deductionAmount;
    }

    /**
     * @return the typeOfDeduction
     */
    public String getTypeOfDeduction() {
        return typeOfDeduction;
    }

    /**
     * @param typeOfDeduction the typeOfDeduction to set
     */
    public void setTypeOfDeduction(String typeOfDeduction) {
        this.typeOfDeduction = typeOfDeduction;
    }

    /**
     * @return the deductionAmount
     */
    public double getDeductionAmount() {
        return deductionAmount;
    }

    /**
     * @param deductionAmount the deductionAmount to set
     */
    public void setDeductionAmount(double deductionAmount) {
        this.deductionAmount = deductionAmount;
    }
    
}
