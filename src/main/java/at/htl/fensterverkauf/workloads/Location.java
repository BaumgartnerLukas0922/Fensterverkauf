package at.htl.fensterverkauf.workloads;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Location {

    @Id
    int locationId;

    String address;
    @ManyToOne
    Customer customer;

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
