package com.cnn.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {


    @FindBy(xpath = "(//a[@title='visit the US section'])[1]")
    private WebElement cignaLogo;


    public void verifyIfLogoIsDipalyed() {
        Assert.assertTrue(cignaLogo.isDisplayed());


    }
}
