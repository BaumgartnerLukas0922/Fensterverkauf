package at.htl.fensterverkauf.workloads;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Worker extends Employee{

    @Id
    int WorkerId;

    @ManyToOne
    Window windows; //should be a List

    //region Constructor
    public Worker(String firstName, String lastName, Double salary, int hours, Window windows) {
        super(firstName, lastName, salary, hours);
        this.windows = windows;
    }

    public Worker() {

    }
    //endregion

    //region Getter & Setter

    public Window getWindows() {
        return windows;
    }

    public void setWindows(Window windows) {
        this.windows = windows;
    }

    //endregion


    @Override
    public String toString() {
        return "Worker{" +
                "WorkerId=" + WorkerId +
                ", windows=" + windows +
                '}';
    }
}
