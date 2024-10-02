package top.jonakls.dentalclinic.persistent;

import top.jonakls.dentalclinic.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;

public class UserJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public UserJpaController() {
        this.emf = Persistence.createEntityManagerFactory("DentalClinicPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(final UserEntity user) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public UserEntity findUserEntity(final String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(UserEntity.class, id);
        } finally {
            em.close();
        }
    }

    public void update(final UserEntity user) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void delete(final UserEntity user) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(user));
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
