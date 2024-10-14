package top.jonakls.dentalclinic.entity;

import top.jonakls.dentalclinic.entity.person.DentistEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class HoursEntity implements ObjectEntity {

    @Id
    private int id;
    private String initialHour;
    private String finalHour;
    @OneToOne
    private DentistEntity dentist;

    public HoursEntity() {
    }

    public HoursEntity(int id, String initialHour, String finalHour, DentistEntity dentist) {
        this.id = id;
        this.initialHour = initialHour;
        this.finalHour = finalHour;
        this.dentist = dentist;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInitialHour() {
        return this.initialHour;
    }

    public void setInitialHour(String initialHour) {
        this.initialHour = initialHour;
    }

    public String getFinalHour() {
        return this.finalHour;
    }

    public void setFinalHour(String finalHour) {
        this.finalHour = finalHour;
    }

    public DentistEntity getDentist() {
        return this.dentist;
    }

    public void setDentist(DentistEntity dentist) {
        this.dentist = dentist;
    }
}
