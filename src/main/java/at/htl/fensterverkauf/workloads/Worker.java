package at.htl.fensterverkauf.workloads;


import javax.persistence.*;
import java.util.List;

@Entity
public class Worker extends Employee{

    @Id
    int WorkerId;

    @OneToMany
    List<Window> windows; //should be a List

    //region Constructor
    public Worker(String firstName, String lastName, Double salary, int hours, List<Window> windows) {
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
