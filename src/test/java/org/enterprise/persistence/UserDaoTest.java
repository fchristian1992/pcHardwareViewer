package org.enterprise.persistence;

import org.enterprise.entity.User;
import org.enterprise.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UserDaoTest {
    UserDao dao;

    @BeforeEach
    void setUp() {
        dao = new UserDao();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void getByIdTest() {
        User retrievedUser = dao.getById(1);
        assertEquals("fchristian", retrievedUser.getUsername());
    }

    @Test
    void saveOrUpdateUserTest() {
        String newUsername = "FrankChristian";
        User userToUpdate = dao.getById(1);
        userToUpdate.setUsername(newUsername);
        dao.saveOrUpdate(userToUpdate);
        User retrievedUser = dao.getById(1);
        assertEquals("FrankChristian", retrievedUser.getUsername());
    }

    @Test
    void insertUserTest() {
        User userToInsert = new User("CChristian", "pugs");
        int id = dao.insert(userToInsert);
        User insertedUser = dao.getById(id);
        assertEquals("CChristian", insertedUser.getUsername());
    }

    @Test
    void deleteTest() {
        dao.delete(dao.getById(1));
        assertNull(dao.getById(1));

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }
}
