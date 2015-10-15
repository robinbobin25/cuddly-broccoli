package com.epam.atlpoc.pages;

import org.openqa.selenium.WebDriver;

public class AbstractPage extends AbstractWebEntity {
    public AbstractPage(WebDriver driver) {
        super(driver);
    }

    public void vek(){
        $("//somexpath").click();
    }
}
