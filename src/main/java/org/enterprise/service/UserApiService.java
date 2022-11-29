package org.enterprise.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.enterprise.entity.User;
import org.enterprise.persistence.GenericDao;

public class UserApiService {
    private final Logger logger = LogManager.getLogger(this.getClass());
    ObjectMapper mapper = new ObjectMapper();

    /**
     * Create a new user.
     * CREATE.r.u.d
     *
     * @param username
     * @param password
     * @return
     */
    public String createUser(String username, String password) {
        // Create a new user object.
        User newUser = new User(username, password);

        // Create a new userDao.
        GenericDao<User> userDao = new GenericDao<>(User.class);

        // Insert the new user into the database.
        userDao.insert(newUser);

        logger.debug("Sending back new user info: " + newUser);

        String json = null;

        try {
            json = mapper.writeValueAsString(newUser);

            logger.debug("ResultingJSONstring = " + json);
        } catch (JsonProcessingException e) {
            logger.error("JSON Processing Exception: " + e);
        }

        return json;
    }

    /**
     * Method to get a single user from the database.
     * c.READ.u.d
     *
     * @param userId the id of the user to get.
     * @return the user with the given id.
     */
    public String getSpecificUser(int userId) {
        GenericDao<User> userDao = new GenericDao<>(User.class);

        // Populate a user with user info from the database by a given id.
        User user = userDao.getById(userId);

        logger.debug("Sending back user with id " + userId + "..." + user);

        String json = null;

        try {
            json = mapper.writeValueAsString(user);

            logger.debug("ResultingJSONstring = " + json);

        } catch (JsonProcessingException e) {
            logger.error("JSON Processing Exception: " + e);
        }

        return json;
    }

    /**
     * Update an existing user.
     * c.r.UPDATE.d
     *
     * @param userId ID number of the user to be updated
     * @param username username of the user to be updated
     * @param password password of the user to be updated
     * @return the updated user.
     */
    public String updateUser(int userId, String username, String password) {
        // Create a new userDao.
        GenericDao<User> userDao = new GenericDao<>(User.class);

        // Get the user object by the given id.
        User user = userDao.getById(userId);

        // Update the user object with the new information.
        // If an entry is null, then don't update it.
        if (username != null) {
            user.setUsername(username);
        }

        if (password != null) {
            user.setPassword(password);
        }

        // Update the user in the database.
        userDao.saveOrUpdate(user);

        logger.debug("Sending back updated user info: " + user);

        String json = null;

        try {
            json = mapper.writeValueAsString(user);

            logger.debug("ResultingJSONstring = " + json);
        } catch (JsonProcessingException e) {
            logger.error("JSON Processing Exception: " + e);
        }

        return json;
    }

    /**
     * Delete a user.
     * c.r.u.DELETE
     *
     * @param userId
     * @return
     */
    public String deleteUser(int userId) {
        // Create a new userDao.
        GenericDao<User> userDao = new GenericDao<>(User.class);

        // Get the user object by the given id.
        User user = userDao.getById(userId);

        // Delete the user from the database.
        userDao.delete(user);

        logger.debug("Sending back deleted user info: " + user);

        String json = null;

        try {
            json = mapper.writeValueAsString(user);

            logger.debug("ResultingJSONstring = " + json);

        } catch (JsonProcessingException e) {
            logger.error("JSON Processing Exception: " + e);
        }

        return json;
    }
}
