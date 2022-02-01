package at.htl.fensterverkauf.workloads;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"Order\"")
public class Commission {

    @Id
    int orderId;

    @ManyToOne
    Shipment shipment;
    @ManyToOne
    Location location;

    //region Constructor

    public Commission(Shipment shipment, Location location) {
        this.shipment = shipment;
        this.location = location;
    }

    public Commission() {
    }
    //endregion

    //region Getter & Setter

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    //endregion


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", shipment=" + shipment +
                ", location=" + location +
                '}';
    }
}