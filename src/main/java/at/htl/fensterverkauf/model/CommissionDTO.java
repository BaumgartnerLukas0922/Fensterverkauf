package at.htl.fensterverkauf.model;

import at.htl.fensterverkauf.workloads.Order.Location.Location;
import at.htl.fensterverkauf.workloads.Order.Shipment.Shipment;


public class CommissionDTO {

    private Shipment shipment;
    private Location location;

    public CommissionDTO() {
    }

    public CommissionDTO(Shipment shipment, Location location) {
        this.shipment = shipment;
        this.location = location;
    }

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
}
