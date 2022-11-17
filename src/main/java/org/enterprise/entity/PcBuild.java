package org.enterprise.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Objects;

/**
 * The type Pc build.
 */
@Entity(name = "PcBuild")
@Table(name = "computer_builds")
public class PcBuild {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int buildId;

    @Column(name = "cpu_model")
    private String cpuModel;

    @Column(name = "gpu_model")
    private String gpuModel;

    @Column(name = "cpu_cooler_model")
    private String cpuCoolerModel;

    @Column(name = "Motherboard_model")
    private String motherboardModel;

    @Column(name = "psu_model")
    private String psuModel;

    @Column(name = "case_model")
    private String caseModel;

    @Column(name = "data_storage_model")
    private String dataStorageModel;

    @Column(name = "ram_model")
    private String ramModel;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;

    public PcBuild() {
    }

    /**
     * Instantiates a new Pc build.
     *
     * @param cpuModel         the cpu model
     * @param gpuModel         the gpu model
     * @param cpuCoolerModel   the cpu cooler model
     * @param motherboardModel the motherboard model
     * @param psuModel         the psu model
     * @param caseModel        the case model
     * @param dataStorageModel the data storage model
     * @param ramModel         the ram model
     * @param user             the user
     */
    public PcBuild(String cpuModel, String gpuModel, String cpuCoolerModel,
            String motherboardModel, String psuModel, String caseModel,
            String dataStorageModel, String ramModel, User user) {
        this.cpuModel = cpuModel;
        this.gpuModel = gpuModel;
        this.cpuCoolerModel = cpuCoolerModel;
        this.motherboardModel = motherboardModel;
        this.psuModel = psuModel;
        this.caseModel = caseModel;
        this.dataStorageModel = dataStorageModel;
        this.ramModel = ramModel;
        this.user = user;
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
     * Gets cpu model.
     *
     * @return the cpu model
     */
    public String getCpuModel() {
        return cpuModel;
    }

    /**
     * Sets cpu model.
     *
     * @param cpuModel the cpu model
     */
    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
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
     * Gets motherboard model.
     *
     * @return the motherboard model
     */
    public String getMotherboardModel() {
        return motherboardModel;
    }

    /**
     * Sets motherboard model.
     *
     * @param motherboardModel the motherboard model
     */
    public void setMotherboardModel(String motherboardModel) {
        this.motherboardModel = motherboardModel;
    }

    /**
     * Gets psu model.
     *
     * @return the psu model
     */
    public String getPsuModel() {
        return psuModel;
    }

    /**
     * Sets psu model.
     *
     * @param psuModel the psu model
     */
    public void setPsuModel(String psuModel) {
        this.psuModel = psuModel;
    }

    /**
     * Gets case model.
     *
     * @return the case model
     */
    public String getCase_Model() {
        return caseModel;
    }

    /**
     * Sets case model.
     *
     * @param caseModel the case model
     */
    public void setCase_Model(String caseModel) {
        this.caseModel = caseModel;
    }

    /**
     * Gets data storage model.
     *
     * @return the data storage model
     */
    public String getDataStorageModel() {
        return dataStorageModel;
    }

    /**
     * Sets data storage model.
     *
     * @param dataStorageModel the data storage model
     */
    public void setDataStorageModel(String dataStorageModel) {
        this.dataStorageModel = dataStorageModel;
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
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUserId(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PcBuild{" +
                "buildId=" + buildId +
                ", cpuModel='" + cpuModel + '\'' +
                ", gpuModel='" + gpuModel + '\'' +
                ", cpuCoolerModel='" + cpuCoolerModel + '\'' +
                ", motherboardModel='" + motherboardModel + '\'' +
                ", psuModel='" + psuModel + '\'' +
                ", caseModel='" + caseModel + '\'' +
                ", dataStorageModel='" + dataStorageModel + '\'' +
                ", ramModel='" + ramModel + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PcBuild pcBuild = (PcBuild) o;
        return buildId == pcBuild.buildId
                && Objects.equals(cpuModel, pcBuild.cpuModel)
                && Objects.equals(gpuModel, pcBuild.gpuModel)
                && Objects.equals(cpuCoolerModel, pcBuild.cpuCoolerModel)
                && Objects.equals(motherboardModel, pcBuild.motherboardModel)
                && Objects.equals(psuModel, pcBuild.psuModel)
                && Objects.equals(caseModel, pcBuild.caseModel)
                && Objects.equals(dataStorageModel, pcBuild.dataStorageModel)
                && Objects.equals(ramModel, pcBuild.ramModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildId, cpuModel, gpuModel, cpuCoolerModel,
                motherboardModel, psuModel, caseModel, dataStorageModel,
                ramModel);
    }
}
