package at.htl.fensterverkauf.workloads.Person;


import at.htl.fensterverkauf.workloads.Window.Glasswindow;

import javax.persistence.*;
import java.util.List;

@Entity
public class Worker extends Employee {

    @OneToMany
    List<Glasswindow> glasswindows;

    //region Constructor
    public Worker(String firstName, String lastName, Double salary, int hours, List<Glasswindow> glasswindows) {
        super(firstName, lastName, salary, hours);
        this.glasswindows = glasswindows;
    }

    public Worker() {

    }
    //endregion

    //region Getter & Setter

    public List<Glasswindow> getWindows() {
        return glasswindows;
    }

    public void setWindows(List<Glasswindow> glasswindows) {
        this.glasswindows = glasswindows;
    }

    public void addWindow(Glasswindow glasswindow){this.glasswindows.add(glasswindow);}
    //endregion

    @Override
    public String toString() {
        return "Worker{" +
                ", windows=" + glasswindows +
                '}';
    }
}
