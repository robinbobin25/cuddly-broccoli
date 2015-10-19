package com.epam.atlpoc.pages;

import com.epam.atlpoc.pages.store.fragments.Header;
import org.openqa.selenium.WebDriver;

public class AbstractPage extends AbstractWebEntity {

    protected Header header;

    public AbstractPage(WebDriver driver) {
        super(driver);
        header = new Header(driver);
    }

    public Header getHeader() {
        return header;
    }


}
