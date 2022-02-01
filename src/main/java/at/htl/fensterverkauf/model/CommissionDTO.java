package at.htl.fensterverkauf.model;

import at.htl.fensterverkauf.workloads.Commission;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CommissionDTO implements PanacheRepository<Commission> {
}
