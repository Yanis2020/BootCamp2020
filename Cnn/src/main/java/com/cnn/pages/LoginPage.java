package com.cnn.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {


    @FindBy(xpath = "//div[@id='login-modal-content']/form[@action='#']//input[@name='loginEmail']")
    private WebElement enterEmailAddress;

    @FindBy(xpath = "//input[@name='loginPassword']")
    private WebElement enterPassword;

    @FindBy(xpath = "//span[contains(text(),'Log In')]")
    private WebElement submitLogin;


    public void userEnterEmail(String email) {
        enterEmailAddress.sendKeys(email);

    }

    public void userEnterAPassword(String password) {
        enterPassword.sendKeys(password);
    }

    public void userClickOnSubmitLogin() {
        submitLogin.click();
    }


}
