package com.amazontest;

import com.amazon.pages.LoginPage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidation extends TestBase {

    @Test
    public void validateLoginPage() {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickOnSignInButton();
        sleepFor(2);
        loginPage.enterEmailButton("a.yanis27@yahoo.fr");
        sleepFor(2);
        loginPage.clickOnContinueInButton();
        sleepFor(2);
        loginPage.enterAPassword("Kabylie@2016");
        sleepFor(2);
        loginPage.validateSignInSubmitButton();
        sleepFor(2);

    }

}
