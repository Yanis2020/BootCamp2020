package com.amazon.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//span[contains(text(),'Hello, Sign in')]")
    private WebElement signInbButton;


    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement enterEmail;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement enterAPassword;


    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInSubmitButton;

    public void clickOnSignInButton() {
        signInbButton.click();
    }

    public void enterEmailButton(String email) {
        enterEmail.sendKeys(email);
    }


    public void clickOnContinueInButton() {
        continueButton.click();
    }

    public void enterAPassword(String password) {
        enterAPassword.sendKeys(password);
    }

    public void validateSignInSubmitButton() {
        signInSubmitButton.click();
    }


}
