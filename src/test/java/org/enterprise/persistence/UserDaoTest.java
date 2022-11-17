package org.enterprise.persistence;

import org.enterprise.entity.PcBuild;
import org.enterprise.entity.User;
import org.enterprise.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * The type User dao test.
 */
public class UserDaoTest {
    /**
     * The Dao.
     */
    GenericDao<User> dao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        dao = new GenericDao(User.class);
        Database database = Database.getInstance();

        database.runSQL("cleandb.sql");
    }

    /**
     * Gets by id test.
     */
    @Test
    void getByIdTest() {
        User user = new User(1, "fchristian", "student");
        User retrievedUser = dao.getById(1);

        assertEquals(user, retrievedUser);
    }

    /**
     * Save or update user test.
     */
    @Test
    void saveOrUpdateUserTest() {
        String newUsername = "FrankChristian";
        User userToUpdate = dao.getById(1);

        userToUpdate.setUsername(newUsername);
        dao.saveOrUpdate(userToUpdate);

        User retrievedUser = dao.getById(1);

        assertEquals(userToUpdate, retrievedUser);
    }

    /**
     * Insert user test.
     */
    @Test
    void insertUserTest() {
        User userToInsert = new User("CChristian", "pugs");
        int id = dao.insert(userToInsert);
        User insertedUser = dao.getById(id);

        assertEquals(userToInsert, insertedUser);
    }

    /**
     * Delete test.
     */
    @Test
    void deleteTest() {
        dao.delete(dao.getById(2));
        assertNull(dao.getById(2));

        GenericDao<PcBuild> pcBuildDao = new GenericDao(PcBuild.class);

        assertNull(pcBuildDao.getById(2));
    }
}
