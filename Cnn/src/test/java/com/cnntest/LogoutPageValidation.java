package com.cnntest;

import com.base.TestBase;
import com.cnn.pages.LogOutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogoutPageValidation extends TestBase {

    @Test(enabled = false)
    public void userAbleToLogoutFromTheWebsite() {
        LogOutPage logOutPage = PageFactory.initElements(driver, LogOutPage.class);
        driver.findElement(By.cssSelector("svg.user-icon")).click();
        sleepFor(2);
        logOutPage.userEnterEmail("kacibousad@gmail.com");
        sleepFor(2);
        logOutPage.userEnterAPassword("Cnn@2020");
        sleepFor(2);
        logOutPage.userClickOnSubmitLogin();
        sleepFor(3);
        logOutPage.clickOnLogoutIcon();
        sleepFor(2);
        logOutPage.clickOnLogoutBtn();
        sleepFor(2);


    }


}
