package com.citibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(xpath = "//a[@id='headerLoka ogoLink']/div[1]")
    private WebElement citiBankIcon;


    public void checkIfLogoDisplays() {
        Assert.assertTrue(citiBankIcon.isDisplayed());
    }


}
