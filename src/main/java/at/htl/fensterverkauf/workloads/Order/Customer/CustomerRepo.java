package at.htl.fensterverkauf.workloads.Order.Customer;

import java.util.List;

public interface CustomerRepo {
    void add(Customer customer);
    void deleteCustomer(Customer customer);
    Customer getById(int id);
    List<Customer> getAll();
    List<Customer> getByLastname(String lastname);
}
