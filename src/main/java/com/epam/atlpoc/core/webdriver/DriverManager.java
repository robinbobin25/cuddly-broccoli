package com.epam.atlpoc.core.webdriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {

//    private static Logger LOGGER = Logger.getLogger(DriverManager.class);
//
//    public static WebDriver getDriver() {
//        if (driver.get() == null) {
//            LOGGER.info("Thread has no WedDriver, creating new one");
//            setWebDriver(DriverFactory.createInstance(null));
//        }
//        LOGGER.debug("Getting instance of remote driver" + driver.get().getClass());
//        return driver.get();
//    }
//
//    public static void setWebDriver(WebDriver driver) {
//        DriverManager.driver.set(driver);
//    }
//
//    public static String getBrowserInfo() {
//        LOGGER.debug("Getting browser info");
//        Capabilities cap = ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
//        String b = cap.getBrowserName();
//        String os = cap.getPlatform().toString();
//        String v = cap.getVersion();
//        return String.format("%s v:%s %s", b, v, os);
//    }
}

