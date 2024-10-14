package top.jonakls.dentalclinic.entity;

import top.jonakls.dentalclinic.entity.person.DentistEntity;
import top.jonakls.dentalclinic.entity.person.PatientEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TurnEntity implements ObjectEntity {

    @Id
    private int turnId;
    private String dateTurn;
    private String hourTurn;
    private String treatment;

    @ManyToOne
    @JoinColumn(name = "id_patient")
    private PatientEntity patient;
    @ManyToOne
    @JoinColumn(name = "id_dentist")
    private DentistEntity dentist;

    public TurnEntity() {
    }

    public TurnEntity(int turnId, String dateTurn, String hourTurn, String treatment, PatientEntity patient, DentistEntity dentist) {
        this.turnId = turnId;
        this.dateTurn = dateTurn;
        this.hourTurn = hourTurn;
        this.treatment = treatment;
        this.patient = patient;
        this.dentist = dentist;
    }

    @Override
    public int getId() {
        return this.turnId;
    }

    public void setTurnId(int id) {
        this.turnId = id;
    }

    public String getDateTurn() {
        return this.dateTurn;
    }

    public void setDateTurn(String dateTurn) {
        this.dateTurn = dateTurn;
    }

    public String getHourTurn() {
        return this.hourTurn;
    }

    public void setHourTurn(String hourTurn) {
        this.hourTurn = hourTurn;
    }

    public String getTreatment() {
        return this.treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public PatientEntity getPatient() {
        return this.patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }

    public DentistEntity getDentist() {
        return this.dentist;
    }

    public void setDentist(DentistEntity dentist) {
        this.dentist = dentist;
    }
}
