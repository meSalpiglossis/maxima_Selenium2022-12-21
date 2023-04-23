import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static helpers.WebBrowser.closeWebBrowser;
import static helpers.WebBrowser.webBrowser;


public class TestBaseDrop2 {

    String testURL = "https://crossbrowsertesting.github.io/drag-and-drop.html";

    @BeforeMethod
    void openAppInChromeBrowser() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        webBrowser().get(testURL);
    }
//
//    @AfterMethod
//    void driverQuit() {
//        closeWebBrowser();
//    }
}
