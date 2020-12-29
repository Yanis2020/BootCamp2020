package com.facebooktest;

import com.base.TestBase;
import com.facebook.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    @Test(enabled = false)
    public void userValidateIfInHomePage() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateIfInFacebookPage();
        sleepFor(2);


    }
}
