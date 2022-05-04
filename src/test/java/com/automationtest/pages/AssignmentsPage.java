package com.automationtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AssignmentsPage extends PreventiveMaintenancePage {
    @FindBy(xpath = "//a[@id='m308a50dd-tab_anchor' and @title='Assignments']")
    WebElement AssigmentsTab;

    public AssignmentsPage() {

        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public void clickonAssignmentsTab(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(AssigmentsTab));
    }

}



