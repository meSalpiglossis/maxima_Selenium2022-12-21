import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static helpers.WebBrowser.closeWebBrowser;
import static helpers.WebBrowser.webBrowser;


public class TestBase {

    String testURL = "https://the-internet.herokuapp.com/";

    @BeforeMethod
    public void openAppInChromeBrowser() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        webBrowser().get(testURL);
    }

    @AfterMethod
    public void driverQuit() {
        closeWebBrowser();
    }
}
