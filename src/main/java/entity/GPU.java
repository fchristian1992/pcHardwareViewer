package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

/**
 * The type Gpu.
 */
@Entity(name = "GPU")
@Table(name = "gpu", schema = "hardwareviewer")
public class GPU {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int gpuId;

    @Column(name = "GPU_model")
    private String gpuModel;

    @Column(name = "VRAM_GB")
    private int vramGb;

    @Column(name = "base_freq_GHz")
    private float baseFreqGHz;

    @Column(name = "boost_freq_GHz")
    private float boostFreqGHz;

    @Column(name = "memory_interface_width_bits")
    private int memoryInterfaceWidthBits;

    /**
     * Gets gpu id.
     *
     * @return the gpu id
     */
    public int getGpuId() {
        return gpuId;
    }

    /**
     * Sets gpu id.
     *
     * @param gpuId the gpu id
     */
    public void setGpuId(int gpuId) {
        this.gpuId = gpuId;
    }

    /**
     * Gets gpu model.
     *
     * @return the gpu model
     */
    public String getGpuModel() {
        return gpuModel;
    }

    /**
     * Sets gpu model.
     *
     * @param gpuModel the gpu model
     */
    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    /**
     * Gets vram gb.
     *
     * @return the vram gb
     */
    public Integer getVramGb() {
        return vramGb;
    }

    /**
     * Sets vram gb.
     *
     * @param vramGb the vram gb
     */
    public void setVramGb(Integer vramGb) {
        this.vramGb = vramGb;
    }

    /**
     * Gets base freq g hz.
     *
     * @return the base freq g hz
     */
    public float getBaseFreqGHz() {
        return baseFreqGHz;
    }

    /**
     * Sets base freq g hz.
     *
     * @param baseFreqGHz the base freq g hz
     */
    public void setBaseFreqGHz(float baseFreqGHz) {
        this.baseFreqGHz = baseFreqGHz;
    }

    /**
     * Gets boost freq g hz.
     *
     * @return the boost freq g hz
     */
    public float getBoostFreqGHz() {
        return boostFreqGHz;
    }

    /**
     * Sets boost freq g hz.
     *
     * @param boostFreqGHz the boost freq g hz
     */
    public void setBoostFreqGHz(float boostFreqGHz) {
        this.boostFreqGHz = boostFreqGHz;
    }

    /**
     * Gets memory interface width bits.
     *
     * @return the memory interface width bits
     */
    public int getMemoryInterfaceWidthBits() {
        return memoryInterfaceWidthBits;
    }

    /**
     * Sets memory interface width bits.
     *
     * @param memoryInterfaceWidthBits the memory interface width bits
     */
    public void setMemoryInterfaceWidthBits(Integer memoryInterfaceWidthBits) {
        this.memoryInterfaceWidthBits = memoryInterfaceWidthBits;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "gpuId=" + gpuId +
                ", gpuModel='" + gpuModel + '\'' +
                ", vramGb=" + vramGb +
                ", baseFreqGHz=" + baseFreqGHz +
                ", boostFreqGHz=" + boostFreqGHz +
                ", memoryInterfaceWidthBits=" + memoryInterfaceWidthBits +
                '}';
    }
}
