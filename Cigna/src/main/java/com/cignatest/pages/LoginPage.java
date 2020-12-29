package com.cignatest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


    @FindBy(linkText = "Log in to myCigna")
    private WebElement loginBtn;

    @FindBy(xpath = "//input[@id='username']")
    private WebElement enterUsername;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement enterPassword;

    @FindBy(xpath = "//input[@id='loginbutton']")
    private WebElement submitBtn;

    public void clickOnSignInBtn() {
        loginBtn.click();
    }

    public void validateEnterUsername(String username) {
        enterUsername.sendKeys(username);
    }

    public void validateEnterPassword(String password) {
        enterPassword.sendKeys(password);
    }

    public void clickOnSubmitBtn() {
        submitBtn.click();
    }

}
