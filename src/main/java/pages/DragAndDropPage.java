package pages;

import helpers.Locators;
import helpers.TextData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static helpers.WebBrowser.webBrowser;

public class DragAndDropPage extends PageBase {


    private static final WebElement BALL = webBrowser().findElement(Locators.get("DragAndDropPage.ball"));
    private static final WebElement GOAL = webBrowser().findElement(Locators.get("DragAndDropPage.goal"));

    private static Actions builder = new Actions(webBrowser());

    // NOT WORKING
    public static void moveBalltoGoal() {
        builder.dragAndDrop(BALL, GOAL).perform();
    }

    public static boolean isAonB() {
        return webBrowser().findElement(Locators.get("DragAndDropPage.goal.pink")).isDisplayed();
    }
}
