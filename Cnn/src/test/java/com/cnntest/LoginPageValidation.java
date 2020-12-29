package com.cnntest;

import com.base.TestBase;
import com.cnn.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidation extends TestBase {

    @Test(enabled = false)
    public void userAbleToLoginIntoTheWebsite() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.findElement(By.cssSelector("svg.user-icon")).click();
        sleepFor(2);
        loginPage.userEnterEmail("kacibousad@gmail.com");
        sleepFor(2);
        loginPage.userEnterAPassword("Cnn@2020");
        sleepFor(2);
        loginPage.userClickOnSubmitLogin();
        sleepFor(3);


    }


}
