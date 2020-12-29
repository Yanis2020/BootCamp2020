package com.cignatest;

import com.base.TestBase;
import com.cignatest.pages.SearchForPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchForValidation extends TestBase {

    @Test
    public void userCanSearchFor() {
        SearchForPage searchForPage = PageFactory.initElements(driver, SearchForPage.class);
        searchForPage.clickOnSearchBar("Medical tools");
        sleepFor(2);
        searchForPage.clickOnSearhBtn();
        sleepFor(2);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,400)", "");
        sleepFor(2);


    }
}
