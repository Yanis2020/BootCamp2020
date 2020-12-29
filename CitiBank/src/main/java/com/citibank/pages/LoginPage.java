package com.citibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(xpath = "//input[@id='username']")
    private WebElement enterUserId;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement enterPassword;

    @FindBy(xpath = "//input[@id='signInBtn']")
    private WebElement signOnBtn;

    public void userEnterUserId(String userId) {
        enterUserId.sendKeys(userId);

    }

    public void userEnterPassword(String password) {
        enterPassword.sendKeys(password);
    }

    public void clickOnSignOn() {
        signOnBtn.click();
    }
}
