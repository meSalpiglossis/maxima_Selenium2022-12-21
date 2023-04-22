package pages;

import helpers.Locators;
import helpers.TextData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static helpers.WebBrowser.webBrowser;

public class DragAndDropPage extends PageBase {


    private static final WebElement ELEMENT_A = webBrowser().findElement(Locators.get("DragAndDropPage.elementA"));
    private static final WebElement ELEMENT_B = webBrowser().findElement(Locators.get("DragAndDropPage.elementB"));

    private static Actions builder = new Actions(webBrowser());

    // NOT WORKING
    public static void moveAtoB() {
        builder.dragAndDrop(ELEMENT_A, ELEMENT_B).perform();
    }

    public static boolean isAonB() {
        return webBrowser().findElement(Locators.get("DragAndDropPage.elementB.pink")).isDisplayed();
    }
}
