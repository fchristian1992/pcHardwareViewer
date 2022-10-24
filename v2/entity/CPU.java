package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 * The type Cpu entity.
 */
@Entity(name = "CPU")
@Table(name = "cpu", schema = "hardwareviewer")
public class CPU {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int cpuId;
    
    @Column(name = "cores")
    private int cores;

    @Column(name = "threads")
    private int threads;

    @Column(name = "base_freq_GHz")
    private float baseFreqGHz;

    @Column(name = "boost_freq_GHz")
    private float boostFreqGHz;

    @Column(name = "TDP_Watts")
    private int tdpWatts;


    /**
     * Gets cpu id.
     *
     * @return the cpu id
     */
    public int getCpuId() {
        return cpuId;
    }

    /**
     * Sets cpu id.
     *
     * @param cpuId the cpu id
     */
    public void setCpuId(int cpuId) {
        this.cpuId = cpuId;
    }

    /**
     * Gets cores.
     *
     * @return the cores
     */
    public Integer getCores() {
        return cores;
    }

    /**
     * Sets cores.
     *
     * @param cores the cores
     */
    public void setCores(Integer cores) {
        this.cores = cores;
    }

    /**
     * Gets threads.
     *
     * @return the threads
     */
    public Integer getThreads() {
        return threads;
    }

    /**
     * Sets threads.
     *
     * @param threads the threads
     */
    public void setThreads(Integer threads) {
        this.threads = threads;
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
     * Gets tdp watts.
     *
     * @return the tdp watts
     */
    public Integer getTdpWatts() {
        return tdpWatts;
    }

    /**
     * Sets tdp watts.
     *
     * @param tdpWatts the tdp watts
     */
    public void setTdpWatts(Integer tdpWatts) {
        this.tdpWatts = tdpWatts;
    }

    @Override
    public String toString() {
        return "CpuEntity{" +
                "cpuId=" + cpuId +
                ", cores=" + cores +
                ", threads=" + threads +
                ", baseFreqGHz=" + baseFreqGHz +
                ", boostFreqGHz=" + boostFreqGHz +
                ", tdpWatts=" + tdpWatts +
                '}';
    }
}
