package top.jonakls.dentalclinic.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity implements ObjectEntity  {

    @Id
    private int dni;
    private String name;
    private String password;
    private String role;

    public UserEntity() {
    }

    public UserEntity(int dni, String name, String password, String role) {
        this.dni = dni;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    @Override
    public int getId() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
