package entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

/**
 * The type Pc case.
 */
@Entity(name = "pcCase")
@Table(name = "pc_case", schema = "hardwareviewer")
public class PcCase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int caseId;

    @Column(name = "case_model")
    private String caseModel;

    @Column(name = "form_factor")
    private String formFactor;

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
     * Gets case model.
     *
     * @return the case model
     */
    public String getCaseModel() {
        return caseModel;
    }

    /**
     * Sets case model.
     *
     * @param caseModel the case model
     */
    public void setCaseModel(String caseModel) {
        this.caseModel = caseModel;
    }

    /**
     * Gets form factor.
     *
     * @return the form factor
     */
    public String getFormFactor() {
        return formFactor;
    }

    /**
     * Sets form factor.
     *
     * @param formFactor the form factor
     */
    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "PcCase{" +
                "caseId=" + caseId +
                ", caseModel='" + caseModel + '\'' +
                ", formFactor='" + formFactor + '\'' +
                '}';
    }
}
