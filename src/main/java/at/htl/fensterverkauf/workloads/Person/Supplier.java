package at.htl.fensterverkauf.workloads.Person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int supplierId;

    private String name;
    private String phoneNumber;
    private double shipmentcost;

    //region Constructor

    public Supplier(String name, String phoneNumber, double shipmentcost) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.shipmentcost = shipmentcost;
    }

    public Supplier() {
    }
    //endregion

    //region Getter & Setter

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
    
    //endregion

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", shipmentcost=" + shipmentcost +
                '}';
    }
}
