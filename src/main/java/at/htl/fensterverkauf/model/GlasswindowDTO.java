package at.htl.fensterverkauf.model;

import at.htl.fensterverkauf.workloads.Order.Commission;
import at.htl.fensterverkauf.workloads.Window.Framebar;
import at.htl.fensterverkauf.workloads.Window.Glasspane;

public class GlasswindowDTO {

    private double width;
    private double height;
    private Framebar framebar;
    private Glasspane glasspane;
    private Commission commission;

    //region Constructor

    public GlasswindowDTO(double width, double height, Framebar framebar, Glasspane glasspane, Commission commission) {
        this.width = width;
        this.height = height;
        this.framebar = framebar;
        this.glasspane = glasspane;
        this.commission = commission;
    }

    public GlasswindowDTO() {
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
}
