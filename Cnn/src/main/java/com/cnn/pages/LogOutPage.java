package com.cnn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage {

    @FindBy(xpath = "//div[@id='login-modal-content']/form[@action='#']//input[@name='loginEmail']")
    private WebElement enterEmailAddress;

    @FindBy(xpath = "//input[@name='loginPassword']")
    private WebElement enterPassword;

    @FindBy(xpath = "//span[contains(text(),'Log In')]")
    private WebElement submitLogin;

    @FindBy(xpath = "//div[@id='account-header-button-desktop']/div[@class='Box-sc-1fet97o-0 hyVhvp']")
    private WebElement logoutIcon;


    @FindBy(xpath = "(//html//li[@id='userLogout-link'])[1]")
    private WebElement logoutBtn;


    public void userEnterEmail(String email) {
        enterEmailAddress.sendKeys(email);

    }

    public void userEnterAPassword(String password) {
        enterPassword.sendKeys(password);
    }

    public void userClickOnSubmitLogin() {
        submitLogin.click();
    }

    public void clickOnLogoutIcon() {
        logoutIcon.click();
    }

    public void clickOnLogoutBtn() {
        logoutBtn.click();
    }


}
