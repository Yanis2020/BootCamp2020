package com.cignatest;

import com.base.TestBase;
import com.cignatest.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LoginPageValidation extends TestBase {

    @Test
    public void validateLogIn() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickOnSignInBtn();
        sleepFor(2);

        // Store all currently open tabs in tabs
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        //Switch newly open Tab
        driver.switchTo().window(tabs.get(1));


        loginPage.validateEnterUsername("Kaci");
        sleepFor(2);
        loginPage.validateEnterPassword("usa2020");
        sleepFor(2);
        loginPage.clickOnSubmitBtn();

        driver.close();

        // Switch to old(Parent) tab.
        driver.switchTo().window(tabs.get(0));


    }
}
