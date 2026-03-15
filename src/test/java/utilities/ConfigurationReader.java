package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {

        try {

            FileInputStream file =
                    new FileInputStream("src/test/resources/configuration.properties");

            properties = new Properties();
            properties.load(file);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public static String getProperty(String key){

        return properties.getProperty(key);

    }

}
// Now we can use:
//      ConfigurationReader.getProperty("url")

