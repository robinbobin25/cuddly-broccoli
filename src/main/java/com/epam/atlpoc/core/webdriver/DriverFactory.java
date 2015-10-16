package com.epam.atlpoc.core.webdriver;

import com.epam.atlpoc.core.properties.PropertyReader;
import com.epam.atlpoc.core.properties.UtilsConstants;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

import static com.epam.atlpoc.core.properties.UtilsConstants.BROWSERS_CONFIGURATION;

public class DriverFactory {

    private static WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(WebDriver.class);

    private static PropertyReader propertiesReader = new PropertyReader(BROWSERS_CONFIGURATION);
    private static final String BROWSER_TYPE = propertiesReader.getPropertyValue("browser.type");

    public static WebDriver createInstance() {
        switch (BROWSER_TYPE) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }
        LOGGER.info("New " + driver.toString() + " was created");
        return optimizeDriver(wrapDriver(driver));
    }

    private static WebDriver wrapDriver(WebDriver driver) {
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        DriverEventHandler driverEventHandler = new DriverEventHandler();
        return eventDriver.register(driverEventHandler);
    }

    private static WebDriver optimizeDriver(WebDriver driver) {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return driver;
    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
