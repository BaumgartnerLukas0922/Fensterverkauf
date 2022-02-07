package at.htl.fensterverkauf.model;

import at.htl.fensterverkauf.workloads.Order.Customer;

public class LocationDTO {

    private String address;
    private Customer customer;

    //region Constructor

    public LocationDTO(String address, Customer customer) {
        this.address = address;
        this.customer = customer;
    }

    public LocationDTO() {
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
}
