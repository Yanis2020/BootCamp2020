package com.citibanktest;

import com.base.TestBase;
import com.citibank.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    @Test
    public void userCheckIfTheIconDisplaysCorrectly() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.checkIfLogoDisplays();
        sleepFor(2);

    }
}
