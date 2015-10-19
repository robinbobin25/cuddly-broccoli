package com.epam.atlpoc.stepdefs;

import com.epam.atlpoc.helpers.HomePageHelper;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class CheckoutStepdefs extends BaseStepDefs{

    HomePageHelper homePageHelper;

    @Before("@Suite")
    public void setUp(){
        setDriver();
        homePageHelper = new HomePageHelper(getDriver());
    }

    @Given("^User clicks Login button on the Homepage$")
    public void User_clicks_Login_button_on_the_Homepage() throws Throwable {

    }
}
