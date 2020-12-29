package com.cignatest;

import com.base.TestBase;
import com.cignatest.pages.DifferentPlansPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DifferentPlansValidation extends TestBase {

    @Test
    public void userCanExploreDifferentHealthPlans() {
        DifferentPlansPage differentPlansPage = PageFactory.initElements(driver, DifferentPlansPage.class);
        differentPlansPage.clickOnIndividualPlan();
        sleepFor(2);
        differentPlansPage.clickOnPlansAndServices();
        sleepFor(2);
        differentPlansPage.clickOnStartExploringPlans();
        sleepFor(2);


    }


}
