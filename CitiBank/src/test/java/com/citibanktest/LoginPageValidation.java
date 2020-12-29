package com.citibanktest;

import com.base.TestBase;
import com.citibank.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidation extends TestBase {

    @Test
    public void userAbleToSignOn() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.userEnterUserId("John Doe");
        sleepFor(2);
        loginPage.userEnterPassword("PNT2020");
        sleepFor(2);
        loginPage.clickOnSignOn();
        sleepFor(5);


    }

}
