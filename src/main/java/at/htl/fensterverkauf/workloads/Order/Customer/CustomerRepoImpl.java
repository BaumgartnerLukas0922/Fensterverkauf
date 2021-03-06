package at.htl.fensterverkauf.workloads.Order.Customer;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@ApplicationScoped
public class CustomerRepoImpl implements CustomerRepo {

    private final EntityManager entityManager;

    public CustomerRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(Customer customer) {
        this.entityManager.persist(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        this.entityManager.remove(customer);
    }

    @Override
    public Customer getById(int id) {
        TypedQuery<Customer> query = this.entityManager
                .createQuery("select c from Customer c where c.id = :ID", Customer.class)
                .setParameter("ID", id);
        return query.getSingleResult();
    }

    @Override
    public List<Customer> getAll() {
        TypedQuery<Customer> query = this.entityManager
                .createQuery("SELECT c from Customer c ",Customer.class);
        return query.getResultList();
    }

    @Override
    public List<Customer> getByLastname(String lastname) {
        TypedQuery<Customer> query = this.entityManager
                .createQuery("SELECT c from Customer c where c.lastName LIKE :LASTNAME",Customer.class)
                .setParameter("LASTNAME",lastname);
        return query.getResultList();
    }
}
