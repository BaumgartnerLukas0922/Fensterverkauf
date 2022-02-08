package at.htl.fensterverkauf.workloads.Order.Commission;

import at.htl.fensterverkauf.workloads.Order.Location.Location;
import at.htl.fensterverkauf.workloads.Order.Shipment.Shipment;

import javax.persistence.*;

@Entity
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commissionId;

    @ManyToOne
    private Shipment shipment;
    @ManyToOne
    private Location location;

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

    public int getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(int commissionId) {
        this.commissionId = commissionId;
    }

    //endregion

    @Override
    public String toString() {
        return String.format("Order: %s %s",shipment.toString(),location.toString());
    }
}