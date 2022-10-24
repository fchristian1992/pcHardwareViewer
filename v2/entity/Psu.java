package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

/**
 * The type Psu.
 */
@Entity(name = "PSU")
@Table(name = "psu", schema = "hardwareviewer")
public class Psu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int psuId;

    @Column(name = "max_wattage")
    private int maxWattage;

    @Column(name = "six_pin_sata_outputs")
    private int sixPinSataOutputs;

    @Column(name = "eight_pin_PCIe_outputs")
    private int eightPinPcIeOutputs;

    @Column(name = "modular")
    private boolean modular;

    /**
     * Gets psu id.
     *
     * @return the psu id
     */
    public int getPsuId() {
        return psuId;
    }

    /**
     * Sets psu id.
     *
     * @param psuId the psu id
     */
    public void setPsuId(int psuId) {
        this.psuId = psuId;
    }

    /**
     * Gets max wattage.
     *
     * @return the max wattage
     */
    public int getMaxWattage() {
        return maxWattage;
    }

    /**
     * Sets max wattage.
     *
     * @param maxWattage the max wattage
     */
    public void setMaxWattage(int maxWattage) {
        this.maxWattage = maxWattage;
    }

    /**
     * Gets six pin sata outputs.
     *
     * @return the six pin sata outputs
     */
    public int getSixPinSataOutputs() {
        return sixPinSataOutputs;
    }

    /**
     * Sets six pin sata outputs.
     *
     * @param sixPinSataOutputs the six pin sata outputs
     */
    public void setSixPinSataOutputs(int sixPinSataOutputs) {
        this.sixPinSataOutputs = sixPinSataOutputs;
    }

    /**
     * Gets eight pin pc ie outputs.
     *
     * @return the eight pin pc ie outputs
     */
    public int getEightPinPcIeOutputs() {
        return eightPinPcIeOutputs;
    }

    /**
     * Sets eight pin pc ie outputs.
     *
     * @param eightPinPcIeOutputs the eight pin pc ie outputs
     */
    public void setEightPinPcIeOutputs(int eightPinPcIeOutputs) {
        this.eightPinPcIeOutputs = eightPinPcIeOutputs;
    }

    /**
     * Gets modular.
     *
     * @return the modular
     */
    public boolean getModular() {
        return modular;
    }

    /**
     * Sets modular.
     *
     * @param modular the modular
     */
    public void setModular(boolean modular) {
        this.modular = modular;
    }

    @Override
    public String toString() {
        return "Psu{" +
                "psuId=" + psuId +
                ", maxWattage=" + maxWattage +
                ", sixPinSataOutputs=" + sixPinSataOutputs +
                ", eightPinPcIeOutputs=" + eightPinPcIeOutputs +
                ", modular=" + modular +
                '}';
    }
}
