package at.htl.fensterverkauf.workloads.Order.Location;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;

import java.util.List;

public interface LocationRepo {
    Location findById(int id);
    void add(Location location);
    List<Location> getAll();
}
