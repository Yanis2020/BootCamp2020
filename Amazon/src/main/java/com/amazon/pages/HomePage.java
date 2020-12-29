package com.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    private WebElement amazonLogo;


    public void setAmazonLogo() {
        LOGGER.info("see if the amazon logo is displayed");
        amazonLogo.isDisplayed();
    }

}
