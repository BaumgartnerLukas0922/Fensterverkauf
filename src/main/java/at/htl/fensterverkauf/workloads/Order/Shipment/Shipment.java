package at.htl.fensterverkauf.workloads.Order;

import at.htl.fensterverkauf.workloads.Person.Driver;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Shipment {

    @Id
    int shipmentId;

    @ManyToOne
    Driver driver;
    @ManyToOne
    Lkw lkw;

    LocalDate date;

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
