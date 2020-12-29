package com.facebook.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeCommentPage {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement enterEmail;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement enterPassword;

    @FindBy(id = "u_0_b")
    private WebElement loginBtn;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[@role='main']/div/div//div[@role='feed']/div[12]/div[@class='du4w35lb k4urcfbm l9j0dhe7 sjgh65i0']/div[@class='du4w35lb l9j0dhe7']/div/div/div[@role='article']/div/div/div/div/div/div[2]/div/div[4]/div//div[@class='ozuftl9m tvfksri0']/div/div[2]/div[@role='button']/div[1]")
    private WebElement commentAPost;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[@role='main']/div/div/div[3]//div[@role='feed']/div[12]/div[@class='du4w35lb k4urcfbm l9j0dhe7 sjgh65i0']/div[@class='du4w35lb l9j0dhe7']/div/div/div[@role='article']/div/div/div/div/div/div[2]/div/div[4]/div//form[@role='presentation']/div//div[@role='textbox']/div/div/div[@class='_1mf _1mj']")
    private WebElement enterAComment;

    public void userEnterAnEmail(String email) {
        enterEmail.sendKeys(email);
    }

    public void userEnterAPassword(String password) {
        enterPassword.sendKeys(password);

    }

    public void userClickOnLoginBtn() {
        loginBtn.click();
    }

    public void userCanCommentAPost() {
        commentAPost.click();
    }

    public void userEnterAComment(String comment) {
        enterAComment.sendKeys(comment, Keys.ENTER);
    }
}


