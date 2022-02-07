package at.htl.fensterverkauf.workloads.Order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lkw {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lkwId;
    private String brand;
    private String model;

    //region Constructor
    public Lkw(int lkwId, String brand, String model) {
        this.lkwId = lkwId;
        this.brand = brand;
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

    public int getLkwId() {
        return lkwId;
    }

    public void setLkwId(int lkwId) {
        this.lkwId = lkwId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //endregion

    @Override
    public String toString() {
        return String.format("Lkw: %s %s", brand, model);
    }
}
