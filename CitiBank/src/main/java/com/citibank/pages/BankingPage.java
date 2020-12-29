package com.citibank.pages;

import com.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BankingPage {

    @FindBy(xpath = "/html//a[@id='banking']")
    private WebElement bankingBtn;

    @FindBy(id = "checkingBanking")
    private WebElement checkingBtn;

    @FindBy(xpath = "/html//input[@id='zipcode']")
    private WebElement enterZipCode;

    @FindBy(xpath = "/html//div[@id='zipcode-modal']/div[@class='modal-dialog']//div[@class='citi-modal-controls']/citi-cta[1]/button[@role='button']")
    private WebElement submitBtn;

    @FindBy(xpath = "(//li[@data-item-value='rates'])[1]")
    private WebElement rateBtn;


    public void mouseOverBankingBtn() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(bankingBtn).build().perform();
    }

    public void clickOnCheckingAccount() {
        checkingBtn.click();
    }

    public void userEntersZipCode(String zipcode) {
        enterZipCode.sendKeys(zipcode);
    }

    public void clickOnSumitBtn() {
        submitBtn.click();
    }

    public void clickOnRatesBankingBtn() {
        rateBtn.click();
    }

}
