package at.htl.fensterverkauf.model;

import at.htl.fensterverkauf.workloads.Order.Lkw.Lkw;
import at.htl.fensterverkauf.workloads.Person.Driver.Driver;

import java.time.LocalDate;

public class ShipmentDTO {

    private Driver driver;
    private Lkw lkw;
    private LocalDate date;
    //region Constructor

    public ShipmentDTO(Driver driver, Lkw lkw, LocalDate date) {
        this.driver = driver;
        this.lkw = lkw;
        this.date = date;
    }

    public ShipmentDTO() {
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
}
