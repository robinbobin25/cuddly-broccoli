package com.epam.atlpoc.pages.store;

import com.epam.atlpoc.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

//    public HomePage go() {
//        this.open("homePage", withParameters(Environment.get().getStoreBaseUrl()));
//        return this;
//    }

    public HomePage openPage(){
        /* ! temporary url sending ! */
        this.driver.get("http://ecsc001027a3.epam.com:8080/AtlasCopco/index.jsp");
        return this;
    }


}
