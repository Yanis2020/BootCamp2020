package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement enterEmail;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement enterPassword;

    @FindBy(id = "u_0_b")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@role='navigation']/span/div/div[@role='button']")
    private WebElement navigateBar;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[@role='banner']/div[4]/div[2]/div/div[2]/div[1]/div[1]/div//div[@role='dialog']/div/div/div/div/div/div[1]//div[@class='b20td4e0 muag1w35']/div[4]/div[@role='button']//i[@class='hu5pjgll lzf7d6o1 sp_jHXvoJjI_al sx_dd42ae']")
    private WebElement logoutBtn;

    public void userEnterAnEmail(String email) {
        enterEmail.sendKeys(email);
    }

    public void userEnterAPassword(String password) {
        enterPassword.sendKeys(password);

    }

    public void userClickOnLoginBtn() {
        loginBtn.click();
    }

    public void clickOnNavigateBar() {
        navigateBar.click();
    }

    public void clickOnLogOutBtn() {
        logoutBtn.click();
    }
}
