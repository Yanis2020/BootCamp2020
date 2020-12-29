package com.cignatest.pages;

import com.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DifferentPlansPage {

    @FindBy(xpath = "//a[@id='individuals-families-level-one-link']")
    private WebElement individualBtn;

    @FindBy(linkText = "Plans and Services Overview")
    private WebElement plansAndServicesBtn;

    @FindBy(xpath = "//a[contains(text(),'Start exploring plans')]")
    private WebElement startExploringPlansBtn;


    public void clickOnIndividualPlan() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(individualBtn).build().perform();
    }

    public void clickOnPlansAndServices() {
        plansAndServicesBtn.click();
    }

    public void clickOnStartExploringPlans() {
        startExploringPlansBtn.click();
    }
}
