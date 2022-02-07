package at.htl.fensterverkauf.workloads.Order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "F_CUSTOMER")
public class Customer {

    @Id
    @Column(name="C_ID")
    int customerId;

    @Column(name="C_FIRSTNAME")
    String firstName;

    @Column(name="C_LASTNAME")
    String lastName;

    //region Constructor

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
    }

    //endregion

    //region Getter & Setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //endregion

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
