package top.jonakls.dentalclinic.controller;

import top.jonakls.dentalclinic.entity.person.PersonEntity;
import top.jonakls.dentalclinic.persistent.ObjectJpaController;

public class PersonPersistenceController {

    private final ObjectJpaController<PersonEntity> objectJpaController = new ObjectJpaController<>(PersonEntity.class);
}
