package helpers;

import io.qameta.allure.Allure;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static helpers.WebBrowser.webBrowser;

public class ScreenShotListener implements ITestListener {

    Logger LOG = Logger.getLogger(ScreenShotListener.class);

    @Override
    public void onTestFailure(ITestResult testResult) {
        LOG.info("Taking a screenshot");

        File screenshot  = ((TakesScreenshot)webBrowser()).getScreenshotAs(OutputType.FILE);
        try {
            Allure.addAttachment(testResult.getTestName() + " screenshot.png", new FileInputStream(screenshot));
        } catch (FileNotFoundException e) {
            LOG.error("Could not take screenshot: " + e.getMessage());
        }
    }
}
