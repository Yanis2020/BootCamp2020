package com.amazontest;

import com.amazon.pages.LoginPage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidation extends TestBase {

    @Test
    public void validateLoginPage() {
        Logi

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickOnSignInButton();
        sleepFor(2);
        loginPage.enterEmailButton("");
        sleepFor(2);
        loginPage.clickOnContinueInButton();
        sleepFor(2);
        loginPage.enterAPassword("");
        sleepFor(2);
        loginPage.validateSignInSubmitButton();
        sleepFor(2);

    }

}
