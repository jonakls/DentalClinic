package top.jonakls.dentalclinic.entity.person;

import top.jonakls.dentalclinic.entity.HoursEntity;
import top.jonakls.dentalclinic.entity.TurnEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class DentistEntity extends PersonEntity {
    private String speciality;
    @OneToOne
    private PatientEntity patient;
    @OneToOne
    private HoursEntity hours;
    @OneToMany(mappedBy = "dentist")
    private List<TurnEntity> turns;

    public DentistEntity() {
    }

    public DentistEntity(int id, String dni, String name, String secondName, String phone, String address, String dateOfBirth, String speciality, PatientEntity patient, HoursEntity hours, List<TurnEntity> turns) {
        super(id, dni, name, secondName, phone, address, dateOfBirth);
        this.speciality = speciality;
        this.patient = patient;
        this.hours = hours;
        this.turns = turns;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public PatientEntity getPatient() {
        return this.patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }

    public HoursEntity getHours() {
        return this.hours;
    }

    public void setHours(HoursEntity hours) {
        this.hours = hours;
    }

    public List<TurnEntity> getTurns() {
        return this.turns;
    }

    public void setTurns(List<TurnEntity> turns) {
        this.turns = turns;
    }
}
