package com.amazontest;

import com.amazon.pages.SignOutPage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignOutValidation extends TestBase {

    @Test

    public void validateSignOut() {
        SignOutPage signOutPage = PageFactory.initElements(driver, SignOutPage.class);
        signOutPage.clickOnSignInButton();
        sleepFor(2);
        signOutPage.enterEmailButton("");
        sleepFor(2);
        signOutPage.clickOnContinueInButton();
        sleepFor(2);
        signOutPage.enterAPassword("");
        sleepFor(2);
        signOutPage.validateSignInSubmitButton();
        sleepFor(2);
        signOutPage.validateClickOnAll();
        sleepFor(2);
        signOutPage.clickOnSignOutBtn();
        sleepFor(2);


    }

}
