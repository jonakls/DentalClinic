package top.jonakls.dentalclinic.persistent;

import top.jonakls.dentalclinic.entity.ObjectEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;

public class ObjectJpaController<T extends ObjectEntity> implements Serializable {

    private final Class<T> clazz;
    private EntityManagerFactory emf = null;

    public ObjectJpaController(Class<T> clazz) {
        this.clazz = clazz;
        this.emf = Persistence.createEntityManagerFactory("DentalClinicPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(final T object) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public T findOne(final int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(clazz, id);
        } finally {
            em.close();
        }
    }

    public void updateOne(final T object) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void deleteOne(final T object) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(object));
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
