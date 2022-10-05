package entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

/**
 * The type Build.
 */
@Entity(name = "Build")
@Table(name = "builds")
public class Build {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int buildId;

    @OneToOne(mappedBy = "cpu", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private int cpuId;

    @OneToOne(mappedBy = "gpu", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private int gpuId;

    @OneToOne(mappedBy = "cpu_cooler", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private int cpuCoolerId;

    @OneToOne(mappedBy = "motherboard", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private int motherboardId;

    @OneToOne(mappedBy = "psu", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private int psuId;

    @OneToOne(mappedBy = "pc_case", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private int caseId;

    @OneToOne(mappedBy = "data_storage", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private int dataStorageId;

    @OneToOne(mappedBy = "ram", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private int ramId;

    /**
     * Instantiates a new Build.
     */
    public Build() {}

    /**
     * Instantiates a new Build.
     *
     * @param buildId       the build id
     * @param cpuId         the cpu id
     * @param gpuId         the gpu id
     * @param cpuCoolerId   the cpu cooler id
     * @param motherboardId the motherboard id
     * @param psuId         the psu id
     * @param caseId        the case id
     * @param dataStorageId the data storage id
     * @param ramId         the ram id
     */
    public Build(int buildId, int cpuId, int gpuId, int cpuCoolerId, int motherboardId, int psuId, int caseId, int dataStorageId, int ramId) {
        this.buildId = buildId;
        this.cpuId = cpuId;
        this.gpuId = gpuId;
        this.cpuCoolerId = cpuCoolerId;
        this.motherboardId = motherboardId;
        this.psuId = psuId;
        this.caseId = caseId;
        this.dataStorageId = dataStorageId;
        this.ramId = ramId;
    }

    /**
     * Gets build id.
     *
     * @return the build id
     */
    public int getBuildId() {
        return buildId;
    }

    /**
     * Sets build id.
     *
     * @param buildId the build id
     */
    public void setBuildId(int buildId) {
        this.buildId = buildId;
    }

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
     * Gets motherboard id.
     *
     * @return the motherboard id
     */
    public int getMotherboardId() {
        return motherboardId;
    }

    /**
     * Sets motherboard id.
     *
     * @param motherboardId the motherboard id
     */
    public void setMotherboardId(int motherboardId) {
        this.motherboardId = motherboardId;
    }

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
     * Gets case id.
     *
     * @return the case id
     */
    public int getCaseId() {
        return caseId;
    }

    /**
     * Sets case id.
     *
     * @param caseId the case id
     */
    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    /**
     * Gets data storage id.
     *
     * @return the data storage id
     */
    public int getDataStorageId() {
        return dataStorageId;
    }

    /**
     * Sets data storage id.
     *
     * @param dataStorageId the data storage id
     */
    public void setDataStorageId(int dataStorageId) {
        this.dataStorageId = dataStorageId;
    }

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

    @Override
    public String toString() {
        return "Build{" +
                "buildId=" + buildId +
                ", cpuId=" + cpuId +
                ", gpuId=" + gpuId +
                ", cpuCoolerId=" + cpuCoolerId +
                ", motherboardId=" + motherboardId +
                ", psuId=" + psuId +
                ", caseId=" + caseId +
                ", dataStorageId=" + dataStorageId +
                ", ramId=" + ramId +
                '}';
    }
}