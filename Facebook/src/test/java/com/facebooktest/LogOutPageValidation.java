package com.facebooktest;

import com.base.TestBase;
import com.facebook.pages.LogOutPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LogOutPageValidation {

    @Test
    public void uerAbleToLogoutIntoFacebookWebsite() {
        Map<String, Object> prefs = new HashMap<String, Object>();

        // Set the notification setting it will override the default setting
        prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
        ChromeOptions options = new ChromeOptions();

        // Set the experimental option
        options.setExperimentalOption("prefs", prefs);

        // pass the options object in Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adele\\IdeaProjects\\BootCamp2020\\generic\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        LogOutPage logOutPage = PageFactory.initElements(driver, LogOutPage.class);
        logOutPage.userEnterAnEmail("");
        TestBase.sleepFor(2);
        logOutPage.userEnterAPassword("");
        TestBase.sleepFor(2);
        logOutPage.userClickOnLoginBtn();
        TestBase.sleepFor(2);

        logOutPage.clickOnNavigateBar();
        TestBase.sleepFor(2);
        logOutPage.clickOnLogOutBtn();
        TestBase.sleepFor(2);
        driver.close();
        driver.quit();

    }
}
