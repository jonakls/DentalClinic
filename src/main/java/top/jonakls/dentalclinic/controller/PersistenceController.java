package top.jonakls.dentalclinic.controller;

import top.jonakls.dentalclinic.entity.UserEntity;
import top.jonakls.dentalclinic.persistent.UserJpaController;

public class PersistenceController {

    private final UserJpaController userJpaController = new UserJpaController();

    public void createUser(final UserEntity user) {
        userJpaController.create(user);
    }

    public UserEntity findUserEntity(final String id) {
        return userJpaController.findUserEntity(id);
    }

    public void updateUser(final UserEntity user) {
        userJpaController.update(user);
    }

    public void deleteUser(final UserEntity user) {
        userJpaController.delete(user);
    }
}
