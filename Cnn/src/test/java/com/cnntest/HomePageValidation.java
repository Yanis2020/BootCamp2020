package com.cnntest;

import com.base.TestBase;
import com.cnn.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    @Test(enabled = false)
    public void UserVerifyIfTheCignaLogoIsDisplayed() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.verifyIfLogoIsDipalyed();
        sleepFor(2);


    }
}
