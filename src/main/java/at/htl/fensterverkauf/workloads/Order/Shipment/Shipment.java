package at.htl.fensterverkauf.workloads.Order.Shipment;

import at.htl.fensterverkauf.workloads.Order.Lkw;
import at.htl.fensterverkauf.workloads.Person.Driver;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shipmentId;

    @ManyToOne
    private Driver driver;
    @ManyToOne
    private Lkw lkw;

    private LocalDate date;

    //region Constructor

    public Shipment(Driver driver, Lkw lkw, LocalDate date) {
        this.driver = driver;
        this.lkw = lkw;
        this.date = date;
    }

    public Shipment() {
    }

    //endregion

    //region Getter & Setter
    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Lkw getLkw() {
        return lkw;
    }

    public void setLkw(Lkw lkw) {
        this.lkw = lkw;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }
    //endregion

    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId=" + shipmentId +
                ", driver=" + driver +
                ", lkw=" + lkw +
                ", date=" + date +
                '}';
    }
}
