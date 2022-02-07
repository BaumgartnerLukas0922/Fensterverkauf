package at.htl.fensterverkauf.workloads.Window;

import at.htl.fensterverkauf.workloads.Order.Commission.Commission;

import javax.persistence.*;

@Entity
public class Glasswindow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int windowId;

    private double width;
    private double height;

    @ManyToOne
    private Framebar framebar;

    @ManyToOne
    private Glasspane glasspane;

    @ManyToOne
    private Commission commission;

    //region Constructor

    public Glasswindow(double width, double height, Framebar framebar, Glasspane glasspane, Commission commission) {
        this.width = width;
        this.height = height;
        this.framebar = framebar;
        this.glasspane = glasspane;
        this.commission = commission;
    }

    public Glasswindow() {
    }
    //endregion

    //region Getter & Setter

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Framebar getFramebar() {
        return framebar;
    }

    public void setFramebar(Framebar framebar) {
        this.framebar = framebar;
    }

    public Glasspane getGlasspane() {
        return glasspane;
    }

    public void setGlasspane(Glasspane glasspane) {
        this.glasspane = glasspane;
    }

    public Commission getOrder() {
        return commission;
    }

    public void setOrder(Commission commission) {
        this.commission = commission;
    }
    //endregion

    @Override
    public String toString() {
        return "Window{" +
                "windowId=" + windowId +
                ", width=" + width +
                ", height=" + height +
                ", framebar=" + framebar +
                ", glasspane=" + glasspane +
                ", commission=" + commission +
                '}';
    }
}
