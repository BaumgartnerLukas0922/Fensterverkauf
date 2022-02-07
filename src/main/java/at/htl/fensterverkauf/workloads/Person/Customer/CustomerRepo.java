package at.htl.fensterverkauf.workloads.Person.Customer;

import java.util.List;

public interface CustomerRepo {
    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Customer getById(int id);
    List<Customer> getAll();
    List<Customer> getByLastname(String lastname);
}
