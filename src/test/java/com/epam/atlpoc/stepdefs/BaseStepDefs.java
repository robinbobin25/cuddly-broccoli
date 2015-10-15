package com.epam.atlpoc.stepdefs;

import com.epam.atlpoc.core.webdriver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseStepDefs {

    private static WebDriver DRIVER;

    public static void setDriver() {
        BaseStepDefs.DRIVER = DriverFactory.createInstance();
    }

//    public void setUp() {
//        System.out.println("SETUP");
//        driver = DriverFactory.createInstance();
//        driver.get("http://www.google.com");
//    }
//
//    public void tearDown() {
//        System.out.println("TEARDOWN");
//        driver.close();
//        driver.quit();
//    }

    public static WebDriver getDriver() {
        return DRIVER;
    }
}
