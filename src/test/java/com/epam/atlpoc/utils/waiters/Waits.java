package com.epam.atlpoc.utils.waiters;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class Waits {

    public static void waitForElementClickable(WebDriver driver, By locator) {
        Wait<WebDriver> wait = getWebDriverWait(driver);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementClickable(WebDriver driver, WebElement element) {
        Wait<WebDriver> wait = getWebDriverWait(driver);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForPresenceOfElementLocated(WebDriver driver, By locator) {
        Wait<WebDriver> wait = getWebDriverWait(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void waitForVisibilityOf(WebDriver driver, WebElement element) {
        Wait<WebDriver> wait = getWebDriverWait(driver);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForVisibilityOf(WebDriver driver, By locator) {
        Wait<WebDriver> wait = getWebDriverWait(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForPresenceOfAllElements(WebDriver driver, By locator) {
        Wait<WebDriver> wait = getWebDriverWait(driver);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public static void waitForTextToBePresentInElement(WebDriver driver, WebElement element, String text) {
        Wait<WebDriver> wait = getWebDriverWait(driver);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public static void delay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            //TODO: Deal with Interrupted Exception
            e.printStackTrace();
        }
    }

    private static Wait<WebDriver> getWebDriverWait(WebDriver driver) {
        return new FluentWait<>(driver)
                .withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
    }
}
