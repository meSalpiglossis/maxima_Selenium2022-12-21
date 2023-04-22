package helpers;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

//UNDER CONSTRUCTION

public class WebBrowser {

    private static WebDriver driver;

    public static synchronized WebDriver webBrowser() {
        if (driver == null) {
            Browsers browser = Browsers.valueOf(System.getProperty("browser", "chrome"));

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setPlatform(Platform.WINDOWS);

            switch (browser) {
                case chrome:
//                    caps.setBrowserName(Browser.CHROME.browserName());
                    driver = new ChromeDriver();
                    break;
                case firefox:
//                    caps.setBrowserName(Browser.FIREFOX.browserName());
                    FirefoxBinary firefoxBinary = new FirefoxBinary();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setBinary(firefoxBinary);
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
            }

//            try {
//                driver = new RemoteWebDriver(new URL("https://the-internet.herokuapp.com/"), caps);
//            } catch (MalformedURLException e) {
//                throw new RuntimeException(e);
//            }
        }
        return driver;
    }

    public static void closeWebBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
