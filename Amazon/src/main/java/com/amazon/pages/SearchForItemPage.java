package com.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchForItemPage {


    private static Logger LOGGER = Logger.getLogger(SearchForItemPage.class);

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']\n")
    private WebElement searchBarbtn;
    @FindBy(xpath = " //header/div[@id='navbar']/div[@id='nav-belt']/div[2]/div[1]/form[1]/div[3]/div[1]/span[1]/input[1]")
    private WebElement clickOnSearchBtn;
    @FindBy(xpath = "//span[contains(text(),'\"ps5 console\"')]")
    private WebElement searchedItemDispalyed;

    public void enterOnSearchBarBtn(String item) {
        LOGGER.info("enter an item to search for it ");
        searchBarbtn.sendKeys(item);
    }

    public void validateClickOnSerachBtn() {
        clickOnSearchBtn.click();
        LOGGER.info("The serach button is clicked");
    }

    public void validateTheSearchedItem() {
        searchedItemDispalyed.isDisplayed();
        LOGGER.info("The searched item is correctly displayed");
    }


}
