package com.facebooktest;

import com.base.TestBase;
import com.facebook.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidation extends TestBase {

    @Test(enabled = false)
    public void uerAbleToLoginIntoFacebookWebsite() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userEnterAnEmail("algeriancommunityatx@gmail.com");
        sleepFor(2);
        loginPage.userEnterAPassword("Kabylie#2969");
        sleepFor(2);
        loginPage.userClickOnLoginBtn();
        sleepFor(5);


    }
}
