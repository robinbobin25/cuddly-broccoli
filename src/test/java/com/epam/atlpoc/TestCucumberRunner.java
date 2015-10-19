package com.epam.atlpoc;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags = {"@Story"}, format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        features = {"src/test/resources/features/"}, glue = "com.epam.atlpoc.stepdefs")
public class TestCucumberRunner extends AbstractTestNGCucumberTests {
}