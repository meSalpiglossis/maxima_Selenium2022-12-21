package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    private static WebDriver driver;

    public static synchronized WebDriver browser() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static synchronized void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
