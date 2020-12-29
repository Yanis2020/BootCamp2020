package com.amazontest;

import com.amazon.pages.SearchForItemPage;
import com.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchForItemValidation extends TestBase {

    @Test
    public void validateIfBrowseProducts() {


        SearchForItemPage searchForItemPage = PageFactory.initElements(driver, SearchForItemPage.class);
        searchForItemPage.enterOnSearchBarBtn("ps5 console");
        sleepFor(2);
        searchForItemPage.validateClickOnSerachBtn();
        sleepFor(2);
        searchForItemPage.validateTheSearchedItem();

    }
}
