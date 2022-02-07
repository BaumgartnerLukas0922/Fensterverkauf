package at.htl.fensterverkauf.workloads.Order.Commission;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class CommissionRepoImpl implements CommissionRepo{

    private final EntityManager entityManager;

    public CommissionRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Commission> getAll() {
        return entityManager
                .createQuery("select c from Commission c", Commission.class)
                .getResultList();
    }

    @Override
    public Commission findById(int id) {
        var query = entityManager.createQuery("select c from Commission c where c.commissionId=:id"
                        , Commission.class)
                .setParameter("id",id);
        return query.getResultStream().findFirst().orElse(null);
    }

    @Override
    public void add(Commission commission) {
        this.entityManager.persist(commission);
    }

}
