package com.cnntest;

import com.base.TestBase;
import com.cnn.pages.SearchForNewsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchForNewsPageValidation extends TestBase {

    @Test
    public void userAbleToTypeOnSearchBar() {
        SearchForNewsPage searchForNewsPage = PageFactory.initElements(driver, SearchForNewsPage.class);

        driver.findElement(By.cssSelector("svg.search-icon")).click();
        sleepFor(2);
        searchForNewsPage.enterANewsToSesarchFor("2020 election");
        sleepFor(2);
        searchForNewsPage.clickOnSubmitSerachBtn();
        sleepFor(5);


    }
}
