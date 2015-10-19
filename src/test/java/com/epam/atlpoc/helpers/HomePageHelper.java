package com.epam.atlpoc.helpers;


import com.epam.atlpoc.pages.store.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageHelper {

    private HomePage homePage;


    public HomePageHelper(WebDriver driver) {
        homePage = new HomePage(driver);
    }


}
