package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.concurrent.TimeUnit;

public class Helpers {

    public void waitForElementVisibility(By by) {
        FluentWait<WebDriver> wait = new FluentWait<>(Driver.Instance);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForElementIsPresent(By by, int timeOut) {
        FluentWait<WebDriver> wait = new FluentWait<>(Driver.Instance);
        wait
                .withTimeout(timeOut, TimeUnit.SECONDS)
                .pollingEvery(250, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(ClassCastException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public boolean isElementDisplayed(By by) {
        Driver.Instance.findElement(by).isDisplayed();
        return true;
    }
}

