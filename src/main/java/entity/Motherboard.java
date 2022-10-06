package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

/**
 * The type Motherboard.
 */
@Entity(name = "Motherboard")
@Table(name = "motherboard")
public class Motherboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int motherboardId;

    @Column(name = "motherboard_model")
    private String motherboardModel;

    @Column(name = "PCIe_16x_slots")
    private int pcie16XSlots;

    @Column(name = "PCIe_8x_slots")
    private int pcie8XSlots;

    @Column(name = "M2_drive_slots")
    private int m2DriveSlots;

    @Column(name = "SATA_ports")
    private int sataPorts;

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
     * Gets pcie 16 x slots.
     *
     * @return the pcie 16 x slots
     */
    public int getPcie16XSlots() {
        return pcie16XSlots;
    }

    /**
     * Sets pcie 16 x slots.
     *
     * @param pcie16XSlots the pcie 16 x slots
     */
    public void setPcie16XSlots(int pcie16XSlots) {
        this.pcie16XSlots = pcie16XSlots;
    }

    /**
     * Gets pcie 8 x slots.
     *
     * @return the pcie 8 x slots
     */
    public int getPcie8XSlots() {
        return pcie8XSlots;
    }

    /**
     * Sets pcie 8 x slots.
     *
     * @param pcie8XSlots the pcie 8 x slots
     */
    public void setPcie8XSlots(int pcie8XSlots) {
        this.pcie8XSlots = pcie8XSlots;
    }

    /**
     * Gets m 2 drive slots.
     *
     * @return the m 2 drive slots
     */
    public int getM2DriveSlots() {
        return m2DriveSlots;
    }

    /**
     * Sets m 2 drive slots.
     *
     * @param m2DriveSlots the m 2 drive slots
     */
    public void setM2DriveSlots(int m2DriveSlots) {
        this.m2DriveSlots = m2DriveSlots;
    }

    /**
     * Gets sata ports.
     *
     * @return the sata ports
     */
    public int getSataPorts() {
        return sataPorts;
    }

    /**
     * Sets sata ports.
     *
     * @param sataPorts the sata ports
     */
    public void setSataPorts(int sataPorts) {
        this.sataPorts = sataPorts;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "motherboardId=" + motherboardId +
                ", motherboardModel='" + motherboardModel + '\'' +
                ", pcie16XSlots=" + pcie16XSlots +
                ", pcie8XSlots=" + pcie8XSlots +
                ", m2DriveSlots=" + m2DriveSlots +
                ", sataPorts=" + sataPorts +
                '}';
    }
}
