package com.facebooktest;

import com.base.TestBase;
import com.facebook.pages.MakeCommentPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MakeCommentPageValidation {

    @Test(enabled = false)
    public void userCanMakeACommentToAFriend() {

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
        driver.manage().window().maximize();

        MakeCommentPage makeCommentPage = PageFactory.initElements(driver, MakeCommentPage.class);

        makeCommentPage.userEnterAnEmail("algeriancommunityatx@gmail.com");
        TestBase.sleepFor(2);
        makeCommentPage.userEnterAPassword("Kabylie#2969");
        TestBase.sleepFor(2);
        makeCommentPage.userClickOnLoginBtn();
        TestBase.sleepFor(5);
        makeCommentPage.userCanCommentAPost();
        TestBase.sleepFor(2);
        makeCommentPage.userEnterAComment("Is there any promotions for drivers ?");
        TestBase.sleepFor(2);

        driver.quit();
    }
}
