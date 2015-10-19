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

    // Scenario: The user can log in
    @Given("user clicks Login button on the Homepage")
    public void clickLoginButton() throws InterruptedException {
        System.out.println(1);
        homePage.openPage();
        Thread.sleep(3000);
        header.clickOnLoginButton();
        Thread.sleep(10000);// can't see login button because header and homepage are separately intialized
    }

    @When("Login overlay is displayed")
    public void loginOverlayIsDisplayed() {
        System.out.println(2);
    }

    @Then("user enters his valid credentials")
    public void enterLoginAndPassword() {
        System.out.println(3);
    }

    @Then("Homepage is displayed with signed-in name")
    public void homePageIsDisplayedForSignedInUser() {
        System.out.println(4);
    }

    @After("@Suite") // or after every @story?
    public void tearDownDriver() {
        getDriver().close();
        getDriver().quit();
    }
}
