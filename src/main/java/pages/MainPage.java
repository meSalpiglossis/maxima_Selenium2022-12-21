package pages;

import org.openqa.selenium.By;

import helpers.Locators;
import helpers.TextData;

import static helpers.WebBrowser.webBrowser;

public class MainPage extends PageBase{

    private static final String TITLE_EXPECTED = TextData.get("MainPage.title");
    private static final By LINK_JS_ALERTS = Locators.get("MainPage.link.JSAlerts");
    private static final By LINK_DRAG_AND_DROP = Locators.get("MainPage.link.DragAndDrop");

    public static boolean titleIsPresented() {
        return titleIsPresented(TITLE_EXPECTED);
    }

    public static void clickJavaScriptAlertsLink() {
        webBrowser().findElement(LINK_JS_ALERTS).click();
    }


    public static void clickDragAndDropLink() {
        webBrowser().findElement(LINK_DRAG_AND_DROP).click();
    }
}
