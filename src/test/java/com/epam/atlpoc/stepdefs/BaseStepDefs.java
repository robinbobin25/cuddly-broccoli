package com.epam.atlpoc.stepdefs;

import com.epam.atlpoc.core.webdriver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class BaseStepDefs {

    private static WebDriver DRIVER;

    public static void setDriver() {
        BaseStepDefs.DRIVER = DriverFactory.createInstance();
    }

    public static WebDriver getDriver() {
        return DRIVER;
    }


}
