package com.cnn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchForNewsPage {


    @FindBy(xpath = "//input[@id='header-search-bar']")
    private WebElement searchBar;

    @FindBy(xpath = "(//header[@id='header-nav-container']/div/div[2]/div/div/form/button/div)[1]")
    private WebElement submitSearchBtn;


    public void enterANewsToSesarchFor(String itemToSearch) {
        searchBar.sendKeys(itemToSearch);
    }

    public void clickOnSubmitSerachBtn() {
        submitSearchBtn.click();
    }
}
