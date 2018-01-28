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
        try (InputStream is = loader.getResourceAsStream("config/application.properties" )) {
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  properties;
    }

}
