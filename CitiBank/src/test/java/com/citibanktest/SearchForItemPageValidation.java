package com.citibanktest;

import com.base.TestBase;
import com.citibank.pages.SearchForItemPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchForItemPageValidation extends TestBase {

    @Test
    public void userAbleToEnterAnItemToSearchForIt() {
        SearchForItemPage searchForItemPage = PageFactory.initElements(driver, SearchForItemPage.class);
        searchForItemPage.clickOnSearchBar();
        sleepFor(2);
        searchForItemPage.userEntersItemToSearch("Open a new account");
        sleepFor(2);


    }
}
