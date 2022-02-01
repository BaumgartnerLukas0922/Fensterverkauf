package at.htl.fensterverkauf.workloads;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Window {

    @Id
    int windowId;

    double width;
    double height;

    @ManyToOne
    Framebar framebar;

    @ManyToOne
    Glasspane glasspane;

    @ManyToOne
    Order order;

    //region Constructor

    public Window(double width, double height, Framebar framebar, Glasspane glasspane, Order order) {
        this.width = width;
        this.height = height;
        this.framebar = framebar;
        this.glasspane = glasspane;
        this.order = order;
    }

    public Window() {
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
                ", order=" + order +
                '}';
    }
}
