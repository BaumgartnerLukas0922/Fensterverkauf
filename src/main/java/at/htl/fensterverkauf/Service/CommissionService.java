package at.htl.fensterverkauf.Service;

import at.htl.fensterverkauf.workloads.Commission;

public interface CommissionService {

    Commission getAll();
    Commission findCommission(int id);
}
