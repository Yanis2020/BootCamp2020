package com.facebook.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchForANamePage {


    @FindBy(xpath = "//input[@id='email']")
    private WebElement enterEmail;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement enterPassword;

    @FindBy(id = "u_0_b")
    private WebElement loginBtn;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]//div[@role='banner']/div[2]/div//input[@role='combobox']")
    private WebElement nameToSearch;


    public void userEnterAnEmail(String email) {
        enterEmail.sendKeys(email);
    }

    public void userEnterAPassword(String password) {
        enterPassword.sendKeys(password);

    }

    public void userClickOnLoginBtn() {
        loginBtn.click();
    }

    public void enterANameToSerach(String name) {
        nameToSearch.sendKeys(name, Keys.ENTER);
    }


}
