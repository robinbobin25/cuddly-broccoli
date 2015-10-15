package com.epam.atlpoc.stepdefs;

import com.epam.atlpoc.pages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class MyStepdefs extends BaseStepDefs {

    HomePage homePage;

    @Before("@Suite")
    public void lol() {
        setDriver();
    }

    @After("@Suite")
    public void tearDown(){
        getDriver().close();
        getDriver().quit();
    }

    @Before
    public void setUp() {
        homePage = new HomePage(getDriver());
    }


    @Then("^I should see page url \"([^\"]*)\"$")
    public void I_should_see_page_url(String arg1) throws Throwable {
        System.out.println("lo2l");
    }

    @Given("^I open pn.com.ua$")
    public void I_open_pn_com_ua() throws Throwable {
        getDriver().get("https://www.google.com.ua/");
    }

    @When("^I select category \"([^\"]*)\"$")
    public void I_select_category(String arg1) throws Throwable {
        getDriver().get("https://github.com/");
        System.out.println(" PC 1 I select");
    }

    @Then("^verify that has sub-column$")
    public void verify_that_has_sub_column() throws Throwable {
        System.out.println("lol3");

    }

    @When("^I select \"([^\"]*)\"$")
    public void I_select(String arg1) throws Throwable {
        getDriver().get("https://groups.google.com/forum/#!topic/testng-users/TbcvtQN8umo");
        System.out.println(" PC 3 I select");
    }

    @When("^I loh$")
    public void I_loh() throws Throwable {
        getDriver().get("https://books.sonatype.com/mcookbook/reference/ch07s06.html");
        Assert.assertTrue(true);
    }

    @When("^I ne loh$")
    public void I_ne_loh() throws Throwable {
        getDriver().get("https://books.sonatype.com/mcookbook/reference/ch07s06.html");
    }
}
