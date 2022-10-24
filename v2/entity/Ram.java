package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

/**
 * The type Ram.
 */
@Entity(name = "RAM")
@Table(name = "ram")
public class Ram {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int ramId;

    @Column(name = "RAM_model")
    private String ramModel;

    @Column(name = "capacity_GB")
    private int capacityGb;

    @Column(name = "speed_MHz")
    private int speedMHz;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "memory_timings")
    private String memoryTimings;

    /**
     * Gets ram id.
     *
     * @return the ram id
     */
    public int getRamId() {
        return ramId;
    }

    /**
     * Sets ram id.
     *
     * @param ramId the ram id
     */
    public void setRamId(int ramId) {
        this.ramId = ramId;
    }

    /**
     * Gets ram model.
     *
     * @return the ram model
     */
    public String getRamModel() {
        return ramModel;
    }

    /**
     * Sets ram model.
     *
     * @param ramModel the ram model
     */
    public void setRamModel(String ramModel) {
        this.ramModel = ramModel;
    }

    /**
     * Gets capacity gb.
     *
     * @return the capacity gb
     */
    public int getCapacityGb() {
        return capacityGb;
    }

    /**
     * Sets capacity gb.
     *
     * @param capacityGb the capacity gb
     */
    public void setCapacityGb(int capacityGb) {
        this.capacityGb = capacityGb;
    }

    /**
     * Gets speed m hz.
     *
     * @return the speed m hz
     */
    public int getSpeedMHz() {
        return speedMHz;
    }

    /**
     * Sets speed m hz.
     *
     * @param speedMHz the speed m hz
     */
    public void setSpeedMHz(int speedMHz) {
        this.speedMHz = speedMHz;
    }

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(int quantity) {
         this.quantity = quantity;
    }

    /**
     * Gets memory timings.
     *
     * @return the memory timings
     */
    public String getMemoryTimings() {
        return memoryTimings;
    }

    /**
     * Sets memory timings.
     *
     * @param memoryTimings the memory timings
     */
    public void setMemoryTimings(String memoryTimings) {
        this.memoryTimings = memoryTimings;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "ramId=" + ramId +
                ", ramModel='" + ramModel + '\'' +
                ", capacityGb=" + capacityGb +
                ", speedMHz=" + speedMHz +
                ", quantity=" + quantity +
                ", memoryTimings='" + memoryTimings + '\'' +
                '}';
    }
}
