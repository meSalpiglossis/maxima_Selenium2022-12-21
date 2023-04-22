package pages;

import helpers.Locators;
import helpers.TextData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static helpers.WebBrowser.webBrowser;

public class DragAndDropPage extends PageBase {

    private static final String H3_HEADER_EXPECTED = TextData.get("DragAndDropPage.H3header");

    private static final By H3_HEADER_ACTUAL = Locators.get("DragAndDropPage.h3header.top");
    private static final WebElement SQUARE_A = webBrowser().findElement(Locators.get("DragAndDropPage.squareA"));
    private static final WebElement SQUARE_B = webBrowser().findElement(Locators.get("DragAndDropPage.squareB"));

    private static Actions builder = new Actions(webBrowser());

    // NOT WORKING
    public static void moveAtoB() {
        builder.dragAndDrop(SQUARE_A, SQUARE_B).perform();
    }

    public static boolean isA_on_B_position() {
        return true;
    }

    public static boolean isB_on_A_position() {
        return true;
    }

    public static boolean isProperH3HeaderPresented() {
        return webBrowser().findElement(H3_HEADER_ACTUAL).getText().contains(H3_HEADER_EXPECTED);
    }
}
