package com.automationtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ActualsPage extends PreventiveMaintenancePage {
    @FindBy(xpath = "//*[@id='m272f5640-tab_anchor' and @title='Actuals']")
    WebElement ActualsTab;
    @FindBy(css = "#m4dfd8aef_bg_button_addrow-pb")
    WebElement Newrow;
    @FindBy(css = "#m71551ec4-tb")
    WebElement Worktype;
    @FindBy(css = "#mef50ddba-tb")
    WebElement LabourField;
    @FindBy(css = "#mf3329b8e-tb")
    WebElement StartDateField;
    @FindBy(css = "#m89f2c8ee-tb")
    WebElement FinishDateField;
    @FindBy(css = "#m5df1446b-tb")
    WebElement StartTimeField;
    @FindBy(css = "#m6d560e2d-tb")
    WebElement FinishTimeField;
    @FindBy(css = "#toolactions_SAVE-tbb_image")
    WebElement SaveButton;

    public ActualsPage() {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void clickonActualsTab() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement element = ActualsTab;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickonNewRow() {
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        WebElement element = Newrow;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void enterLaborNumber() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(2000);
        //LabourField.sendKeys("404320");
        String Customer = "404320";
        WebElement element = LabourField;
        element.clear();
        for (int i = 0; i < Customer.length(); i++) {
            char c = Customer.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);
            Thread.sleep(1000);
        }

    }
    public void enterStartDate() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        DateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = new Date();
        String date2 = dateFormat.format(date).trim();
        //WebDriverWait wait = new WebDriverWait(driver, 100);
        //wait.until(ExpectedConditions.elementToBeClickable(StartDateField)).sendKeys(date2);
        WebElement Start = StartDateField;
        Start.clear();
        for (int i = 0; i < date2.length(); i++) {
            char c = date2.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Start.sendKeys(s);

        }
    }

    public void enterFinishDate() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        DateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = new Date();
        String date1 = dateFormat.format(date).trim();
        //WebDriverWait wait = new WebDriverWait(driver, 100);
        //wait.until(ExpectedConditions.elementToBeClickable(FinishDateField)).sendKeys(date1);
        WebElement Finish = FinishDateField;
        Finish.clear();
        for (int i = 0; i < date1.length(); i++) {
            char c = date1.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Finish.sendKeys(s);
        }


    }

    public void enterStartTimeforTravel() throws InterruptedException {
        Thread.sleep(1000);
        String time = "9:00 AM";
        WebElement Start = StartTimeField;
        Start.clear();
        for (int i = 0; i < time.length(); i++) {
            char c = time.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Start.sendKeys(s);

        }

    }

    public void enterEndTimeforTravel() throws InterruptedException {
        Thread.sleep(2000);
        String time = "9:15 AM";
        WebElement Finish = FinishTimeField;
        Finish.clear();
        for (int i = 0; i < time.length(); i++) {
            char c = time.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Finish.sendKeys(s);

        }

    }

    public void enterStartTimeforOnsite() throws InterruptedException {
        Thread.sleep(2000);
        String time = "9:15 AM";
        WebElement Start = StartTimeField;
        Start.clear();
        for (int i = 0; i < time.length(); i++) {
            char c = time.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Start.sendKeys(s);


        }


    }

    public void enterEndTimeforOnsite() throws InterruptedException {
        Thread.sleep(2000);
        String time = "9:30 AM";
        WebElement Finish = FinishTimeField;
        Finish.clear();
        for (int i = 0; i < time.length(); i++) {
            char c = time.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Finish.sendKeys(s);
        }
    }

    public void enterStartTimeforWork() throws InterruptedException {
        Thread.sleep(2000);
        String time = "9:30 AM";
        WebElement Start = StartTimeField;
        Start.clear();
        for (int i = 0; i < time.length(); i++) {
            char c = time.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Start.sendKeys(s);


        }


    }

    public void enterEndTimeforWork() throws InterruptedException {
        Thread.sleep(2000);
        String time = "9:45 AM";
        WebElement Finish = FinishTimeField;
        Finish.clear();
        for (int i = 0; i < time.length(); i++) {
            char c = time.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Finish.sendKeys(s);
        }
    }

    public void enterStartTimeforWoComp() throws InterruptedException {
        Thread.sleep(2000);
        String time = "9:45 AM";
        WebElement Start = StartTimeField;
        Start.clear();
        for (int i = 0; i < time.length(); i++) {
            char c = time.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Start.sendKeys(s);


        }


    }

    public void enterEndTimeforWoComp() throws InterruptedException {
        Thread.sleep(2000);
        String time = "10.00 AM";
        WebElement Finish = FinishTimeField;
        Finish.clear();
        for (int i = 0; i < time.length(); i++) {
            char c = time.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Finish.sendKeys(s);
        }
    }

    public void selectTravelType() throws InterruptedException {
        Thread.sleep(2000);
        Worktype.clear();
        Worktype.sendKeys("TRAVEL");
    }

    public void selectWorkType() throws InterruptedException {
        Thread.sleep(2000);
        Worktype.clear();
        Worktype.sendKeys("WORK");


    }

    public void selectonsiteType() throws InterruptedException {
        Thread.sleep(2000);
        Worktype.clear();
        Worktype.sendKeys("ONSITE");
    }

    public void selectwocompType() throws InterruptedException {
        Thread.sleep(2000);
        Worktype.clear();
        Worktype.sendKeys("WOCOMP");
    }

    public void clickonSaveButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement element = SaveButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);
    }


}





