package com.epam.atlpoc.pages.store.fragments;

import com.epam.atlpoc.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by antonina_mykhailenko on 16.10.2015.
 */
public class LoginOverlay extends AbstractPage {

    private By usernameField = By.name("/atg/userprofiling/ProfileFormHandler.value.login");
    private By passwordField = By.name("/atg/userprofiling/ProfileFormHandler.value.password");

    public LoginOverlay(WebDriver driver) {
        super(driver);
    }

    public void inputUsername(String username){
        inputText(usernameField, username);
    }

}
