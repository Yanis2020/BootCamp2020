package com.citibanktest;

import com.base.TestBase;
import com.citibank.pages.AtmBranchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AtmBranchPageValidation extends TestBase {


    @Test
    public void userWillBeAbleToFindAnATM() {
        AtmBranchPage atmBranchPage = PageFactory.initElements(driver, AtmBranchPage.class);
        atmBranchPage.clickOnAtmBranchIcon();
        sleepFor(2);
        atmBranchPage.userEntersALocation("78701");
        sleepFor(2);
    }
}
