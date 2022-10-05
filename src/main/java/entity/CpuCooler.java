package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

/**
 * The type Cpu cooler.
 */
@Entity(name = "cpuCooler")
@Table(name = "cpu_cooler", schema = "hardwareviewer")
public class CpuCooler {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int cpuCoolerId;

    @Column(name = "cpu_cooler_model")
    private String cpuCoolerModel;

    @Column(name = "fan_size_mm")
    private int fanSizeMm;

    @Column(name = "cooler_height_mm")
    private int coolerHeightMm;

    @Column(name = "TDP_watts")
    private int tdpWatts;

    /**
     * Gets cpu cooler id.
     *
     * @return the cpu cooler id
     */
    public int getCpuCoolerId() {
        return cpuCoolerId;
    }

    /**
     * Sets cpu cooler id.
     *
     * @param cpuCoolerId the cpu cooler id
     */
    public void setCpuCoolerId(int cpuCoolerId) {
        this.cpuCoolerId = cpuCoolerId;
    }

    /**
     * Gets cpu cooler model.
     *
     * @return the cpu cooler model
     */
    public String getCpuCoolerModel() {
        return cpuCoolerModel;
    }

    /**
     * Sets cpu cooler model.
     *
     * @param cpuCoolerModel the cpu cooler model
     */
    public void setCpuCoolerModel(String cpuCoolerModel) {
        this.cpuCoolerModel = cpuCoolerModel;
    }

    /**
     * Gets fan size mm.
     *
     * @return the fan size mm
     */
    public int getFanSizeMm() {
        return fanSizeMm;
    }

    /**
     * Sets fan size mm.
     *
     * @param fanSizeMm the fan size mm
     */
    public void setFanSizeMm(int fanSizeMm) {
        this.fanSizeMm = fanSizeMm;
    }

    /**
     * Gets cooler height mm.
     *
     * @return the cooler height mm
     */
    public int getCoolerHeightMm() {
        return coolerHeightMm;
    }

    /**
     * Sets cooler height mm.
     *
     * @param coolerHeightMm the cooler height mm
     */
    public void setCoolerHeightMm(int coolerHeightMm) {
        this.coolerHeightMm = coolerHeightMm;
    }

    /**
     * Gets tdp watts.
     *
     * @return the tdp watts
     */
    public int getTdpWatts() {
        return tdpWatts;
    }

    /**
     * Sets tdp watts.
     *
     * @param tdpWatts the tdp watts
     */
    public void setTdpWatts(int tdpWatts) {
        this.tdpWatts = tdpWatts;
    }

    @Override
    public String toString() {
        return "CpuCooler{" +
                "cpuCoolerId=" + cpuCoolerId +
                ", cpuCoolerModel='" + cpuCoolerModel + '\'' +
                ", fanSizeMm=" + fanSizeMm +
                ", coolerHeightMm=" + coolerHeightMm +
                ", tdpWatts=" + tdpWatts +
                '}';
    }
}
