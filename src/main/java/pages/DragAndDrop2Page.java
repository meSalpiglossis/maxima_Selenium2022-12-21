package pages;

import helpers.Locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static helpers.WebBrowser.webBrowser;

public class DragAndDrop2Page extends PageBase {


    private static final WebElement SQUARE_SMALL = webBrowser().findElement(Locators.get("DragAndDrop2Page.squareSmall"));
    private static final WebElement SQUARE_BIG = webBrowser().findElement(Locators.get("DragAndDrop2Page.squareBig"));

    private static final String SUCCESS_TEXT_EXPECTED = "Dropped!";

    private static Actions doThe = new Actions(webBrowser());

    public static void moveSmallSquareToBigSquare() {
        doThe.dragAndDrop(SQUARE_SMALL, SQUARE_BIG).perform();
    }

    public static boolean successTextPresented() {
        return SQUARE_BIG.getText().contains(SUCCESS_TEXT_EXPECTED);
    }
}
