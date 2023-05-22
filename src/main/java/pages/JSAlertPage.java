package pages;

import helpers.Locators;
import helpers.TextData;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static helpers.WebBrowser.webBrowser;

public class JSAlertPage extends PageBase{

    private static Logger LOG = Logger.getLogger(JSAlertPage.class);

    private static final String TITLE = TextData.get("JSAlertPage.title");
    private static final String H3_HEADER_EXPECTED = TextData.get("JSAlertPage.H3header");
    private static final String JS_ALERT_MESSAGE_EXPECTED = TextData.get("JSAlertPage.AlertMessage");
    private static final String JS_ALERT_RESULT_EXPECTED = TextData.get("JSAlertPage.AlertResultText");
    private static final String JS_CONFIRM_MESSAGE_EXPECTED = TextData.get("JSAlertPage.ConfirmMessage");
    private static final String JS_CONFIRM_RESULT_EXPECTED = TextData.get("JSAlertPage.ConfirmCancelResultText");
    private static final String JS_PROMPT_MESSAGE_EXPECTED = TextData.get("JSAlertPage.PromptMessage");
    private static final String JS_PROMPT_RESULT_EXPECTED = TextData.get("JSAlertPage.PromptResultText");
    private static final String SOME_TEXT = TextData.get("JSAlertPage.PromptResultText");
    private static final By BUTTON_FOR_JS_ALERT = Locators.get("JSAlertPage.button.jsAlert");
    private static final By BUTTON_FOR_JS_CONFIRM = Locators.get("JSAlertPage.button.jsConfirm");
    private static final By BUTTON_FOR_JS_PROMPT = Locators.get("JSAlertPage.button.jsPrompt");
    private static final By JS_ALERTS_RESULT = Locators.get("JSAlertPage.text.Result");
    private static final By H3_HEADER_ACTUAL = Locators.get("JSAlertPage.h3header.top");

    public static boolean isProperH3HeaderPresented() {
        return isProperH3HeaderPresented(H3_HEADER_ACTUAL, H3_HEADER_EXPECTED);
    }

    public static void clickJSAlertButton() {
        LOG.info("Clicking JSAlertButton");
        webBrowser().findElement(BUTTON_FOR_JS_ALERT).click();
    }

    public static void clickJSConfirmButton() {
        LOG.info("Clicking JSConfirmButton");
        webBrowser().findElement(BUTTON_FOR_JS_CONFIRM).click();
    }

    public static void clickJSPromptButton() {
        LOG.info("Clicking JSPromptButton");
        webBrowser().findElement(BUTTON_FOR_JS_PROMPT).click();
    }

    public static void clickAlertAccept() {
        LOG.info("Clicking AlertAccept");
        webBrowser().switchTo().alert().accept();
    }

    public static void clickAlertDismiss() {
        LOG.info("Clicking AlertDismiss");
        webBrowser().switchTo().alert().dismiss();
    }

    public static boolean isProperJSAlertMessage() {
        LOG.info("Checking AlertMessage");
        return alertText().contains(JS_ALERT_MESSAGE_EXPECTED);
    }

    public static boolean isProperJSConfirmMessage() {
        LOG.info("Checking ConfirmMessage");
        return alertText().contains(JS_CONFIRM_MESSAGE_EXPECTED);
    }

    public static boolean isProperJSPromptMessage() {
        LOG.info("Checking PromptMessage");
        return alertText().contains(JS_PROMPT_MESSAGE_EXPECTED);
    }

    public static boolean isProperJSAlertResult() {
        LOG.info("Checking AlertResult");
        return webBrowser().findElement(JS_ALERTS_RESULT).getText().contains(JS_ALERT_RESULT_EXPECTED);
    }

    public static boolean isProperJSConfirmResult() {
        LOG.info("Checking ConfirmResult");
        return webBrowser().findElement(JS_ALERTS_RESULT).getText().contains(JS_CONFIRM_RESULT_EXPECTED);
    }

    public static boolean isProperJSPromptResult() {
        LOG.info("Checking PromptResult");
        return webBrowser().findElement(JS_ALERTS_RESULT).getText().contains(JS_PROMPT_RESULT_EXPECTED);
    }

    public static void inputSomeTextToJSPromptTextField() {
        LOG.info("Input 'some text' to JSPromptTextField");
        webBrowser().switchTo().alert().sendKeys(SOME_TEXT);
    }

    private static String alertText() {
        LOG.debug("Get text from alert");
        return webBrowser().switchTo().alert().getText();
    }
}
