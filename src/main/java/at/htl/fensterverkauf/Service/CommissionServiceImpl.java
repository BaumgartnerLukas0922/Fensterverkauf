package at.htl.fensterverkauf.Service;

import at.htl.fensterverkauf.workloads.Commission;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CommissionServiceImpl implements CommissionService {

    public CommissionServiceImpl() {
    }

    public Commission getAll(){
        return new Commission();
    }

    public Commission findCommission(int id){
        return new Commission();
    }
}
