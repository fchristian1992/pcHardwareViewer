package org.enterprise.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.enterprise.entity.User;



/**
 * The type User dao.
 */
public class UserDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets a user by id.
     *
     * @param id the user id
     * @return the user by id
     */
    public User getById(int id) {
        Session session = sessionFactory.openSession();
        User user = session.get(User.class, id);
        session.close();
        return user;
    }

    /**
     * Save or update the user.
     *
     * @param user the user
     */
    public void saveOrUpdate(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
    }

    /**
     * Inserts a user.
     *
     * @param user the user
     * @return the int
     */
    public int insert(User user) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(user);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Deletes a user.
     *
     * @param user the user
     */
    public void delete(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }
}
