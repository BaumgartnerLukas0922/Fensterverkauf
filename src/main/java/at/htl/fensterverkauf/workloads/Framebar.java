package at.htl.fensterverkauf.workloads;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Framebar {

    @Id
    int framebarId;

    String material;
    int length;

    //region Constructor
    public Framebar(String material, int length) {
        this.material = material;
        this.length = length;
    }

    public Framebar() {
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


    @Override
    public String toString() {
        return "Framebar{" +
                "framebarId=" + framebarId +
                ", material='" + material + '\'' +
                ", length=" + length +
                '}';
    }
}
