package top.jonakls.dentalclinic.entity.person;

import top.jonakls.dentalclinic.entity.TurnEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.List;

@Entity
public class PatientEntity extends PersonEntity implements Serializable {
    private boolean hasEps;
    private String typeBlood;
    @OneToOne
    private ResponsibleEntity responsible;
    @OneToMany(mappedBy = "patient")
    private List<TurnEntity> turns;

    public PatientEntity() {
    }

    public PatientEntity(int id, String dni, String name, String secondName, String phone, String address, String dateOfBirth, boolean hasEps, String typeBlood) {
        super(id, dni, name, secondName, phone, address, dateOfBirth);
        this.hasEps = hasEps;
        this.typeBlood = typeBlood;
    }

    public boolean isHasEps() {
        return hasEps;
    }

    public void setHasEps(boolean hasEps) {
        this.hasEps = hasEps;
    }

    public boolean getHasEps() {
        return this.hasEps;
    }

    public String getTypeBlood() {
        return this.typeBlood;
    }

    public void setTypeBlood(String typeBlood) {
        this.typeBlood = typeBlood;
    }

    public ResponsibleEntity getResponsible() {
        return this.responsible;
    }

    public void setResponsible(ResponsibleEntity responsible) {
        this.responsible = responsible;
    }

    public List<TurnEntity> getTurns() {
        return this.turns;
    }

    public void setTurns(List<TurnEntity> turns) {
        this.turns = turns;
    }
}
