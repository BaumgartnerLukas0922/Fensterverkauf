package at.htl.fensterverkauf.workloads;

import javax.persistence.*;

@Entity
public class Commission {

    @Id
    public int commissionId;

    @ManyToOne(cascade = CascadeType.ALL)
    Shipment shipment;
    @ManyToOne(cascade = CascadeType.ALL)
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
                "commissionId=" + commissionId +
                ", shipment=" + shipment +
                ", location=" + location +
                '}';
    }
}
