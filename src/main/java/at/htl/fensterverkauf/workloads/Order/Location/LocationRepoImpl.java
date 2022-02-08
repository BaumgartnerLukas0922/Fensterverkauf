package at.htl.fensterverkauf.workloads.Order.Location;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class LocationRepoImpl implements LocationRepo{

    private final EntityManager entityManager;

    public LocationRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Location findById(int id) {
        var query = entityManager.createQuery("select l from Location l where l.locationId=:id"
                        , Location.class)
                .setParameter("id",id);
        return query.getResultStream().findFirst().orElse(null);
    }

    @Override
    @Transactional
    public void add(Location location) {
        this.entityManager.persist(location);
    }

    @Override
    public List<Location> getAll() {
        return this.entityManager.createQuery("select l from Location l", Location.class).getResultList();
    }

}
