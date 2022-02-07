package at.htl.fensterverkauf.workloads.Person.Driver;

public interface DriverRepo {
    Driver findById(int id);
    void add(Driver driver);
}
