package at.htl.fensterverkauf.workloads.Order.Shipment;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class ShipmentRepoImpl implements ShipmentRepo{

    private final EntityManager entityManager;

    public ShipmentRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Shipment findShipmentById(int id) {
        var query = entityManager.createQuery("select s from Shipment s where s.shipmentId=:id"
                ,Shipment.class)
                .setParameter("id",id);
        return query.getResultStream().findFirst().orElse(null);
    }

    @Override
    @Transactional
    public void add(Shipment shipment){
        this.entityManager.persist(shipment);
    }


}
