package com.citibanktest;

import com.base.TestBase;
import com.citibank.pages.BankingPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BankingPageValidation extends TestBase {

    @Test
    public void navigateToCheckingAccount() {
        BankingPage bankingPage = PageFactory.initElements(driver, BankingPage.class);
        bankingPage.mouseOverBankingBtn();
        sleepFor(2);
        bankingPage.clickOnCheckingAccount();
        sleepFor(3);
        bankingPage.userEntersZipCode("78701");
        sleepFor(2);
        bankingPage.clickOnSumitBtn();
        sleepFor(2);


    }

    @Test
    public void navigateToRates() {
        BankingPage bankingPage = PageFactory.initElements(driver, BankingPage.class);
        bankingPage.mouseOverBankingBtn();
        sleepFor(2);
        bankingPage.clickOnRatesBankingBtn();
        sleepFor(3);
        bankingPage.userEntersZipCode("78701");
        sleepFor(2);
        bankingPage.clickOnSumitBtn();
        sleepFor(2);


    }


}
