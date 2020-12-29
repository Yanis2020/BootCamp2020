package com.citibank.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AtmBranchPage {


    @FindBy(xpath = "/html//a[@id='atmbrnchdesk']")
    private WebElement atmBranchIcon;

    @FindBy(xpath = "/html//input[@id='search']")
    private WebElement enterALocation;

    public void clickOnAtmBranchIcon() {
        atmBranchIcon.click();

    }

    public void userEntersALocation(String location) {
        enterALocation.sendKeys(location, Keys.ENTER);

    }
}
