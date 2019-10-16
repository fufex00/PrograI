package prograproject;
import java.util.Date;

public class WorkingSchedule {

    private Date workingHour;

    private String[] workedHours;

    public WorkingSchedule() {
    }

    public WorkingSchedule(Date workingHour, String[] workedHours) {
        this.workingHour = workingHour;
        this.workedHours = workedHours;
    }

    /**
     * @return the workingHour
     */
    public Date getWorkingHour() {
        return workingHour;
    }

    /**
     * @param workingHour the workingHour to set
     */
    public void setWorkingHour(Date workingHour) {
        this.workingHour = workingHour;
    }

    /**
     * @return the workedHours
     */
    public String[] getWorkedHours() {
        return workedHours;
    }

    /**
     * @param workedHours the workedHours to set
     */
    public void setWorkedHours(String[] workedHours) {
        this.workedHours = workedHours;
    }
    
}
