package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {


    @FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
    private WebElement facebookLogo;


    public void validateIfInFacebookPage() {
        Assert.assertTrue(facebookLogo.isDisplayed());
    }
}
