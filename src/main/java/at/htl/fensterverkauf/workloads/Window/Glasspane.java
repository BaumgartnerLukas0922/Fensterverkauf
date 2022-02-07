package at.htl.fensterverkauf.workloads.Window;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Glasspane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int glasspaneId;

    private String dimension;
    private double thickness;

    //region Constructor
    public Glasspane(String dimension, double thickness) {
        this.dimension = dimension;
        this.thickness = thickness;
    }

    public Glasspane() {
    }
    //endregion

    //region Getter & Setter
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
    //endregion

    @Override
    public String toString() {
        return "Glasspane{" +
                "glasspaneId=" + glasspaneId +
                ", dimension='" + dimension + '\'' +
                ", thickness=" + thickness +
                '}';
    }
}
