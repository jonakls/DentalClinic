package top.jonakls.dentalclinic.entity.person;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class ResponsibleEntity extends PersonEntity implements Serializable {
    private String typeResponsible;

    public ResponsibleEntity() {
    }

    public ResponsibleEntity(int id, String dni, String name, String secondName, String phone, String address, String dateOfBirth, String typeResponsible) {
        super(id, dni, name, secondName, phone, address, dateOfBirth);
        this.typeResponsible = typeResponsible;
    }

    public String getTypeResponsible() {
        return this.typeResponsible;
    }

    public void setTypeResponsible(String typeResponsible) {
        this.typeResponsible = typeResponsible;
    }
}
