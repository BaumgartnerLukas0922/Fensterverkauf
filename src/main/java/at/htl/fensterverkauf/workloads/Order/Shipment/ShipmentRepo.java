package at.htl.fensterverkauf.workloads.Order.Shipment;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;

public interface ShipmentRepo {
    Shipment findShipmentById(int id);
    void add(Shipment shipment);
}
