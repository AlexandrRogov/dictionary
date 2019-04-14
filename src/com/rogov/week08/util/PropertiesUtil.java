package com.rogov.week08.util;

import com.rogov.week08.exeption.DaoException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public final class PropertiesUtil {

    private static Properties properties;

    static {
        try {
            properties = new Properties();
            properties.load(Files.newBufferedReader(Paths.get("resources", "application.properties")));
        } catch (IOException e) {
            throw new DaoException(e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }

    private PropertiesUtil() {
    }
}
