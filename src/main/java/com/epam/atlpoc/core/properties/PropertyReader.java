package com.epam.atlpoc.core.properties;


import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;

public class PropertyReader {

    private static final Logger LOGGER = Logger.getLogger(PropertyReader.class);

    private String propertyFilePath;
    public Properties properties;

    public PropertyReader(String filePath) {
        propertyFilePath = filePath;
        properties = loadProperties(propertyFilePath);
    }

    public Properties loadProperties(String filePath) {
        properties = new Properties();
        try (InputStream inputStream = Files.newInputStream(Paths.get(".").resolve(propertyFilePath))) {
            properties.load(inputStream);
        } catch (IOException e) {
            LOGGER.error("File '" + propertyFilePath + "' is missing!");
        }
        return properties;
    }

    public String getPropertyValue(String propertyName) {
        try {
            return properties.getProperty(propertyName);
        } catch (NoSuchElementException e) {
            LOGGER.error("There's no such property, like " + propertyName + " in the " + propertyFilePath + "property file");
        }
        return null;
    }

}
