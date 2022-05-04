package com.automationtest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LaborReportingPage extends WorkOrderPage {
    public static String WorkOrderNumber;

    @FindBy(css = "#m68d8715f-tbb_text")
    WebElement AdvancedSearch;
    @FindBy(css = "#m64aa3412-tb")
    static
    WebElement WorkOrderSearchField;
    @FindBy(css = "#m69d4b684-pb")
    static
    WebElement FindButton;
    public LaborReportingPage() {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void clickonAdvancedSearchButton() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        AdvancedSearch.click();

    }

    public static void searchWO(String[] args) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WorkOrderSearchField.click();
        WorkOrderSearchField.sendKeys(WorkOrderPage.WorkOrderNumber);
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(FindButton)).click();
    }

}