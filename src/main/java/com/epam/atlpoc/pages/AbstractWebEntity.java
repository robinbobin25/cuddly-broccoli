package com.epam.atlpoc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AbstractWebEntity {

    protected WebDriver driver;

    public AbstractWebEntity(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(By elementPath) {
        driver.findElement(elementPath).click();
    }

    public void inputText(By elementPath, String text) {
        WebElement element = $(elementPath);
        element.clear();
        element.sendKeys(text);
    }

    protected WebElement $(By element) {
        return driver.findElement(element);
    }

    protected WebElement $(String xpath, String... args) {
        return driver.findElement(By.xpath(String.format(xpath, args)));
    }

    protected List<WebElement> $$(By by) {
        return driver.findElements(by);
    }

}
