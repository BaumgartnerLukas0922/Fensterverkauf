package at.htl.fensterverkauf.model;

public class FramebarDTO {

    private String material;
    private int length;

    //region Constructor
    public FramebarDTO(String material, int length) {
        this.material = material;
        this.length = length;
    }

    public FramebarDTO() {
    }
    //endregion

    //region Getter & Setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    //endregion
}
