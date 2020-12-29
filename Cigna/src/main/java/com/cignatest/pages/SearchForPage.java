package com.cignatest.pages;

import com.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchForPage {

    @FindBy(xpath = "//input[@id='search-desktop']")
    private WebElement searchBar;

    @FindBy(xpath = " //div[@id='header-row']/div[@class='ls-lqr']/div[@class='ls-area']/div[@class='ls-area-body']/div[2]/div[@class='iw_component']//header[@class='header-meganav']/div[2]/nav[1]//ul//form[@action='/search']//button[@class='btn btn-sm']")
    private WebElement searchBtn;


    public void clickOnSearchBar(String keyword) {
        searchBar.sendKeys(keyword);
    }

    public void clickOnSearhBtn() {
        searchBtn.click();

    }
}
