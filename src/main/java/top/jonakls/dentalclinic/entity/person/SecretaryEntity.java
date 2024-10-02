package top.jonakls.dentalclinic.entity.person;

import javax.persistence.Entity;

@Entity
public class SecretaryEntity extends PersonEntity {
    private String sector;

    public SecretaryEntity() {
    }

    public SecretaryEntity(int id, String dni, String name, String secondName, String phone, String address, String dateOfBirth, String sector) {
        super(id, dni, name, secondName, phone, address, dateOfBirth);
        this.sector = sector;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
