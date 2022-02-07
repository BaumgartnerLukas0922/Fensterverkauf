package at.htl.fensterverkauf.workloads.Order.Lkw;

public interface LkwRepo {
    Lkw findById(int id);
    void add(Lkw lkw);
}
