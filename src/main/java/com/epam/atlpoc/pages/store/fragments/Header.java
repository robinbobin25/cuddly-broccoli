package com.epam.atlpoc.pages.store.fragments;

import com.epam.atlpoc.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by antonina_mykhailenko on 16.10.2015.
 */
public class Header extends AbstractPage {

    private By loginButton = By.className("header-btn-login");

    public Header(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginButton(){
        clickElement(loginButton);
    }

}
