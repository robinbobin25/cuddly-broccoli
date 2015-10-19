package com.epam.atlpoc.stepdefs.checkout;

import com.epam.atlpoc.pages.store.HomePage;
import com.epam.atlpoc.pages.store.fragments.Header;
import com.epam.atlpoc.stepdefs.BaseStepDefs;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by antonina_mykhailenko on 16.10.2015.
 */
public class TestLogin extends BaseStepDefs {

    Header header;
    HomePage homePage;

    @Before("@Suite") // or after every @story?
    public void setUpDriver() {
        setDriver();
        homePage = new HomePage(getDriver());
        header = new Header(getDriver());
    }

    @After("@Suite") // or after every @story?
    public void tearDownDriver() {
        getDriver().close();
        getDriver().quit();
    }
}
