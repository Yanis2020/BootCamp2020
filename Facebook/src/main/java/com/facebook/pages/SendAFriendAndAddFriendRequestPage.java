package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendAFriendAndAddFriendRequestPage {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement enterEmail;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement enterPassword;

    @FindBy(id = "u_0_b")
    private WebElement loginBtn;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]//div[@role='banner']/div[3]//div[@role='navigation']/ul/li[2]/span/div/a[@role='link']")
    private WebElement friendBtn;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[@role='navigation']//div[@class='rtmu0sqt']/div[6]/div/a[@role='link']//div[@class='d2edcug0']/div/div[1]/div[@role='button']")
    private WebElement sendAFriendRequestBtn;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[@role='navigation']/div//div[@class='rtmu0sqt']/div[2]/div[2]/div/a[@role='link']//div[@class='d2edcug0']/div/div[1]/div[@role='button']")
    private WebElement acceptAFriendRequestBtn;

    public void userEnterAnEmail(String email) {
        enterEmail.sendKeys(email);
    }

    public void userEnterAPassword(String password) {
        enterPassword.sendKeys(password);

    }

    public void userClickOnLoginBtn() {
        loginBtn.click();
    }

    public void clickOnFriendBtn() {
        friendBtn.click();
    }

    public void userSendAFriendRequest() {
        sendAFriendRequestBtn.click();
    }

    public void userAcceptAFriendRequest() {
        acceptAFriendRequestBtn.click();
    }
}
