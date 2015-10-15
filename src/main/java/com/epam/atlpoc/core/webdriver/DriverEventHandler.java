package com.epam.atlpoc.core.webdriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class DriverEventHandler implements WebDriverEventListener {

    private static Logger LOGGER = Logger.getLogger(DriverEventHandler.class.getName());

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Driver will navigate to:" + s);
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        LOGGER.info("Navigated to " + s);
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        LOGGER.info("WebDriver will find element by - "
                + by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        LOGGER.info("WebDriver will click on element - "
                + elementDescription(webElement));
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        LOGGER.info("WebDriver try to click on element - "
                + elementDescription(webElement));
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        LOGGER.info("WebDriver clicked on element - "
                + elementDescription(webElement));
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver) {
        LOGGER.info("WebDriver will change value for element - "
                + elementDescription(webElement));
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver) {
        LOGGER.info("WebDriver changed value for element - "
                + elementDescription(webElement));
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {

    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {

    }

    private String elementDescription(WebElement element) {
        String description = "tag:" + element.getTagName();
        if (element.getAttribute("id") != null) {
            description += " id: " + element.getAttribute("id");
        } else if (element.getAttribute("name") != null) {
            description += " name: " + element.getAttribute("name");
        }

        description += " ('" + element.getText() + "')";

        return description;
    }
}
