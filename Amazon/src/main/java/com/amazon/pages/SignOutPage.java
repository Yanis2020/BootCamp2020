package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOutPage {

    @FindBy(xpath = " //span[contains(text(),'Hello, Sign in')]")
    private WebElement signInbButton;


    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement enterEmail;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement enterAPassword;


    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInSubmitButton;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/i[1]")
    private WebElement clickOnAllBtn;

    @FindBy(xpath = "//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[36]/a[1]")
    private WebElement signOutBtn;

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


    public void validateClickOnAll() {
        clickOnAllBtn.click();
    }

    public void clickOnSignOutBtn() {
        signOutBtn.click();
    }
}
