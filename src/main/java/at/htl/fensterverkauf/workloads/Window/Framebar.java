package at.htl.fensterverkauf.workloads.Window;

import javax.persistence.*;

@Entity
public class Framebar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int framebarId;

    @Enumerated(EnumType.STRING)
    private Material material;

    private int length;

    //region Constructor
    public Framebar(Material material, int length) {
        this.material = material;
        this.length = length;
    }

    public Framebar() {
    }
    //endregion

    //region Getter & Setter
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
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
