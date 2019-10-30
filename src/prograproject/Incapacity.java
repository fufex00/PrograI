package prograproject;


import java.util.Date;



public class Incapacity {

    private int daysOff;
    private Date dateOfIncapacity;
    

    public void calculateEndIncapacity() {
    }

    public Incapacity() {
    }

    public Incapacity(int daysOff, Date dateOfIncapacity) {
        this.daysOff = daysOff;
        this.dateOfIncapacity = dateOfIncapacity;
    }

    /**
     * @return the daysOff
     */
    public int getDaysOff() {
        return daysOff;
    }

    /**
     * @param daysOff the daysOff to set
     */
    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

    /**
     * @return the dateOfIncapacity
     */
    public Date getDateOfIncapacity() {
        return dateOfIncapacity;
    }

    /**
     * @param dateOfIncapacity the dateOfIncapacity to set
     */
    public void setDateOfIncapacity(Date dateOfIncapacity) {
        this.dateOfIncapacity = dateOfIncapacity;
    }    
}
