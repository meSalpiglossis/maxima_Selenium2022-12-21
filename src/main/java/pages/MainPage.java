package pages;

import helpers.Locators;
import helpers.TextData;
import org.openqa.selenium.By;

import static helpers.WebBrowser.webBrowser;

public class MainPage extends PageBase{

    private static final String TITLE_EXPECTED = TextData.get("MainPage.title");
    private static final By LINK_JS_ALERTS = Locators.get("MainPage.link.JSAlerts");

    public static boolean titleIsPresented() {
        return titleIsPresented(TITLE_EXPECTED);
    }

    public static void clickJavaScriptAlertsLink() {
        webBrowser().findElement(LINK_JS_ALERTS).click();
    }


}
