package org.enterprise.util;

import java.io.IOException;
import java.util.Properties;

/**
 * @author Eric Knapp
 *
 */
public interface PropertiesLoader {
    /**
     * Loads and returns the properties from a given file path
     *
     * @param propertiesFilePath file path of the properties file
     * @return Properties for the given file path
     * @throws IOException if an error occured when reading from the input stream
     */
    default Properties loadProperties(String propertiesFilePath)
            throws Exception {
        Properties properties = new Properties();

        try {
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
        } catch (IOException ioException) {
            ioException.printStackTrace();
            throw ioException;
        } catch (Exception exception) {
            exception.printStackTrace();
            throw exception;
        }

        return properties;
    }
}