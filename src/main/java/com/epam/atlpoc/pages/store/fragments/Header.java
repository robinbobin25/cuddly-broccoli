package com.epam.atlpoc.pages.store.fragments;

import com.epam.atlpoc.pages.AbstractPage;
import com.epam.atlpoc.utils.waiters.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.epam.atlpoc.utils.waiters.Waits.waitForElementClickable;

/**
 * Created by antonina_mykhailenko on 16.10.2015.
 */
public class Header extends AbstractPage {

    private By loginButton = By.className(".header-btn-login div");

    public Header(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginButton(){
        waitForElementClickable(driver, loginButton);
        clickElement(loginButton);
    }

}
