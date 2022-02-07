package at.htl.fensterverkauf.workloads.Person.Driver;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;

@ApplicationScoped
public class DriverRepoImpl implements DriverRepo{

    private final EntityManager entityManager;

    public DriverRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Driver findById(int id) {
        var query = entityManager.createQuery("select d from Driver d where d.empNo=:id"
                        , Driver.class)
                .setParameter("id",id);
        return query.getResultStream().findFirst().orElse(null);
    }

    @Override
    public void add(Driver driver) {
        this.entityManager.persist(driver);
    }
}
