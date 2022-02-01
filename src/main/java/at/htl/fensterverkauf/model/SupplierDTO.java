package at.htl.fensterverkauf.model;

public class SupplierDTO {
    private String name;
    private String phoneNumber;
    private double shipmentcost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getShipmentcost() {
        return shipmentcost;
    }

    public void setShipmentcost(double shipmentcost) {
        this.shipmentcost = shipmentcost;
    }
}
