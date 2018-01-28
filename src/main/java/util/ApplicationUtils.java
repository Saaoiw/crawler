package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ApplicationUtils {

    private ApplicationUtils() {
            }

    public static Properties readAppConfig() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties properties = new Properties();
        try (InputStream is = loader.getResourceAsStream("H:/src/crawler/src/main/resources/config/application.properties")) {
            properties.load(is);
        } catch (IOException e) {
            //TODO: write to log
            e.printStackTrace();
        }
        return properties;
    }

}
