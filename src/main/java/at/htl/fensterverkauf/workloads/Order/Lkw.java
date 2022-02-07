package at.htl.fensterverkauf.workloads.Order;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "F_LKW")
public class Lkw {

    @Id
    int lkwId;

    String model;

    //region Constructor
    public Lkw(String model) {
        this.model = model;
    }

    public Lkw() {
    }
    //endregion

    //region Getter & Setter

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //endregion

    @Override
    public String toString() {
        return "Lkw{" +
                "lkwId=" + lkwId +
                ", model='" + model + '\'' +
                '}';
    }
}
