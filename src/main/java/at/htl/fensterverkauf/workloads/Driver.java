package at.htl.fensterverkauf.workloads;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver extends Employee{

    @Id
    int driverId;

    boolean hasDrivingLicense;
    boolean curDriving;

    //region Constructor
    public Driver(String firstName, String lastName, Double salary, int hours, boolean hasDrivingLicense, boolean curDriving) {
        super(firstName, lastName, salary, hours);
        this.hasDrivingLicense = hasDrivingLicense;
        this.curDriving = curDriving;
    }

    public Driver() {

    }
    //endregion

    //region Getter & Setter
    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public boolean isCurDriving() {
        return curDriving;
    }

    public void setCurDriving(boolean curDriving) {
        this.curDriving = curDriving;
    }
    //endregion


    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", hasDrivingLicense=" + hasDrivingLicense +
                ", curDriving=" + curDriving +
                '}';
    }
}
