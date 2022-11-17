package org.enterprise.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * The type Generic dao.
 *
 * @param <T> the type parameter
 */
public class GenericDao<T> {
    private Class<T> type;
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Instantiates a new Generic dao.
     *
     * @param type the type
     */
    public GenericDao(Class<T> type) {
        this.type = type;
    }

    /**
     * Gets an entity by its id
     *
     * @param <T> the type parameter
     * @param id  the id
     * @return the by id
     */
    public <T>T getById(int id) {
        Session session = getSession();
        T entity = (T)session.get(type, id);

        session.close();
        return entity;
    }

    /**
     * Delete an entity
     *
     * @param entity the entity
     */
    public void delete(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();

        session.delete(entity);
        transaction.commit();
        session.close();
    }

    /**
     * Insert an entity
     *
     * @param entity the entity
     * @return the int
     */
    public int insert(T entity) {
        int id = 0;
        Session session = getSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(entity);

        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Save or update an entity
     *
     * @param entity the entity
     */
    public void saveOrUpdate(T entity) {
        Session session = getSession();
        Transaction transaction = session.beginTransaction();

        session.saveOrUpdate(entity);
        transaction.commit();
        session.close();
    }

    /**
     * Gets a session and opens it
     * @return Session
     */
    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }
}
