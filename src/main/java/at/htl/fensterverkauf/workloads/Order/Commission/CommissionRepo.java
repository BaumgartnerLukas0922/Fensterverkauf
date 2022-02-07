package at.htl.fensterverkauf.workloads.Order.Commission;

import java.util.List;

public interface CommissionRepo {
    List<Commission> getAll();
    Commission findById(int id);
    void add(Commission commission);
}
