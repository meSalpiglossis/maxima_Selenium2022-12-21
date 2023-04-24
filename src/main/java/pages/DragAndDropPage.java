package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helpers.Locators;
import static helpers.WebBrowser.webBrowser;

public class DragAndDropPage extends PageBase {


    private static final WebElement BALL = webBrowser().findElement(Locators.get("DragAndDropPage.ball"));
    private static final WebElement GOAL = webBrowser().findElement(Locators.get("DragAndDropPage.goal"));
    private static final WebElement GOAL_PINK = webBrowser().findElement(Locators.get("DragAndDropPage.goal.pink"));

    private static Actions doThe = new Actions(webBrowser());

    public static void moveBallToGoal() {
        doThe.dragAndDrop(BALL, GOAL).perform();
    }

    public static boolean isGoalPink() {
        return GOAL_PINK.isDisplayed();
    }
}
