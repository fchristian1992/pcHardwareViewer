package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

/**
 * The type Data storage.
 */
@Entity
@Table(name = "data_storage", schema = "hardwareviewer")
public class DataStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int dataStorageId;

    @Column(name = "drive_model")
    private String driveModel;


    @Column(name = "drive_type")
    private String driveType;


    @Column(name = "capacity_GB")
    private int capacityGb;

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
     * Gets drive model.
     *
     * @return the drive model
     */
    public String getDriveModel() {
        return driveModel;
    }

    /**
     * Sets drive model.
     *
     * @param driveModel the drive model
     */
    public void setDriveModel(String driveModel) {
        this.driveModel = driveModel;
    }

    /**
     * Gets drive type.
     *
     * @return the drive type
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * Sets drive type.
     *
     * @param driveType the drive type
     */
    public void setDriveType(String driveType) {
        this.driveType = driveType;
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

    @Override
    public String toString() {
        return "DataStorage{" +
                "dataStorageId=" + dataStorageId +
                ", driveModel='" + driveModel + '\'' +
                ", driveType='" + driveType + '\'' +
                ", capacityGb=" + capacityGb +
                '}';
    }
}
