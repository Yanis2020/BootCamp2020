package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement enterEmail;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement enterPassword;

    @FindBy(id = "u_0_b")
    private WebElement loginBtn;

    public void userEnterAnEmail(String email) {
        enterEmail.sendKeys(email);
    }

    public void userEnterAPassword(String password) {
        enterPassword.sendKeys(password);

    }

    public void userClickOnLoginBtn() {
        loginBtn.click();
    }
}
