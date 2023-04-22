package helpers;

import org.openqa.selenium.By;

import java.io.InputStream;
import java.util.Properties;

public class Locators {

    private static final Properties locators;

    static {
        locators = new Properties();
        InputStream is = Locators.class.getResourceAsStream("/locators.properties");
        try {
            locators.load(is);
            is.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static By get(String element) {
        return By.xpath(locators.getProperty(element));
    }
}
