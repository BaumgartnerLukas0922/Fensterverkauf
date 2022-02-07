package at.htl.fensterverkauf.workloads.Order.Location;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;

public interface LocationRepo {
    Location findById(int id);
    void add(Location location);
}
