package at.htl.fensterverkauf.workloads.Order.Location;

import at.htl.fensterverkauf.workloads.Person.Customer.Customer;

import javax.persistence.*;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int locationId;

    private String address;
    @ManyToOne
    private Customer customer;

    //region Constructor

    public Location(String address, Customer customer) {
        this.address = address;
        this.customer = customer;
    }

    public Location() {
    }

    //endregion

    //region Getter & Setter

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    //endregion

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", address='" + address + '\'' +
                ", customer=" + customer +
                '}';
    }
}

