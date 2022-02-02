package at.htl.fensterverkauf.Repository;

import at.htl.fensterverkauf.workloads.Commission;

import java.util.List;

public interface CommissionRepo {
    Commission addCommission(Commission commission);
    List<Commission> getAll();
    Commission findCommission(Integer id);
}
