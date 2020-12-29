package com.citibank.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchForItemPage {

    @FindBy(xpath = "/html//img[@id='search_icon']")
    private WebElement searchBar;

    @FindBy(xpath = "/html//input[@id='citi-autocomplete-content-searchbox-livesearch']")
    private WebElement enterItemToSearch;

    public void clickOnSearchBar() {
        searchBar.click();
    }

    public void userEntersItemToSearch(String item) {
        enterItemToSearch.sendKeys(item, Keys.ENTER);
    }
}
