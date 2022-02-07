package at.htl.fensterverkauf.workloads.Order.Lkw;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;

@ApplicationScoped
public class LkwRepoImpl implements LkwRepo{

    private final EntityManager entityManager;

    public LkwRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Lkw findById(int id) {
        var query = entityManager.createQuery("select l from Lkw l where l.lkwId=:id"
                        , Lkw.class)
                .setParameter("id",id);
        return query.getResultStream().findFirst().orElse(null);
    }

    @Override
    public void add(Lkw lkw) {
        this.entityManager.persist(lkw);
    }
}
