import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static helpers.WebBrowser.closeWebBrowser;
import static helpers.WebBrowser.webBrowser;


public class TestBaseDrop {

    String testURL = "https://learn.javascript.ru/article/mouse-drag-and-drop/ball4";

    @BeforeMethod
    void openAppInChromeBrowser() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        webBrowser().get(testURL);
    }

    @AfterMethod
    void driverQuit() {
        closeWebBrowser();
    }
}
