package at.htl.fensterverkauf.workloads.Order.Shipment;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;

import java.util.List;

public interface ShipmentRepo {
    Shipment findShipmentById(int id);
    void add(Shipment shipment);
    List<Shipment> getAll();
}
