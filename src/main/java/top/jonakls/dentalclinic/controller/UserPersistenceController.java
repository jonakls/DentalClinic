package top.jonakls.dentalclinic.controller;

import top.jonakls.dentalclinic.entity.UserEntity;
import top.jonakls.dentalclinic.persistent.ObjectJpaController;
import top.jonakls.dentalclinic.util.PasswordUtil;

public class UserPersistenceController {

    private final ObjectJpaController<UserEntity> objectJpaController = new ObjectJpaController<>(UserEntity.class);

    public void registerUser(final UserEntity user) {
        final String password = user.getPassword();

        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }

        user.setPassword(PasswordUtil.hash(password));
        this.objectJpaController.create(user);
    }

    public UserEntity loginUser(final int id, final String password) {
        final UserEntity user = this.objectJpaController.findOne(id);

        if (user == null) {
            return null;
        }

        if (!PasswordUtil.comparePassword(password, user.getPassword())) {
            return null;
        }

        return user;
    }

    public UserEntity findUserEntity(final int id) {
        return this.objectJpaController.findOne(id);
    }

    public void updateUser(final UserEntity user) {
        this.objectJpaController.updateOne(user);
    }

    public void deleteUser(final UserEntity user) {
        this.objectJpaController.deleteOne(user);
    }
}
