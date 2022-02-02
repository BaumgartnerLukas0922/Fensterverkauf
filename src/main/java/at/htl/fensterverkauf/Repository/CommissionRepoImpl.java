package at.htl.fensterverkauf.Repository;

import at.htl.fensterverkauf.workloads.Commission;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class CommissionRepoImpl implements CommissionRepo{

    private final EntityManager entityManager;

    public CommissionRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Commission addCommission(Commission commission){
        entityManager.persist(commission);
        return commission;
    }

    @Override
    public List<Commission> getAll() {
        var query = entityManager.createQuery("select c from Commission c", Commission.class);
        return  query.getResultList();
    }

    @Override
    public Commission findCommission(Integer id) {
        var query = entityManager
                .createQuery("select c from Commission c where c.commissionId=:id",Commission.class)
                .setParameter("id",id);
        return query.getSingleResult();
    }
}
