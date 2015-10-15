package com.epam.atlpoc;

import com.epam.atlpoc.stepdefs.BaseStepDefs;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(tags = {"@Andrey"}, format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        features = {"src/test/resources/features/"}, glue = "com.epam.atlpoc.stepdefs")
public class TestCucumberRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void tearDown() {
        BaseStepDefs.getDriver().close();
        BaseStepDefs.getDriver().quit();
    }
}