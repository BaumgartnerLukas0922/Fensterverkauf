package at.htl.fensterverkauf.model;

public class DriverDTO {

    private boolean hasDrivingLicense;
    private boolean curDriving;

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
}
