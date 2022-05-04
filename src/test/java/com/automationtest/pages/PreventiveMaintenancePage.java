package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PreventiveMaintenancePage extends Testbase {
    @FindBy(xpath = "//input[@id='m6a7dfd2f_tfrow_[C:1]_txt-tb']")
    WebElement PMsearchField;
    @FindBy(xpath = "//span[@id='m6a7dfd2f_tdrow_[C:1]_ttxt-lb[R:0]']")
    WebElement PMlink;
    @FindBy(xpath = "//span[@id='m74daaf83_ns_menu_SETPMCOUNT_OPTION_a_tnode']")
    WebElement SetPMcounterLink;
    @FindBy(xpath = "//input[@id='m786d3a4a-tb']")
    WebElement NewPMcount;
    @FindBy(xpath = "//button[@id='mc2853d87-pb']")
    WebElement OKbutton;
    @FindBy(xpath = "//button[@id='m575c541c-pb']")
    WebElement OK;
    @FindBy(xpath = "//a[@id='m267fb813-tab_anchor']")
    WebElement FrequencyTab;
    @FindBy(xpath = "//input[@id='m4c27d917-tb']")
    static
    WebElement EstimatedNextDueDate;
    @FindBy(xpath = "//*[@id='m74daaf83_ns_menu_GENERATEWO_OPTION_a_tnode']")
    WebElement GenerateWorkOrdersLink;
    @FindBy(xpath = "//input[@id='m2dcaa03a-tb']")
    WebElement WOsDueDate;
    @FindBy(xpath = "//label[contains(@class,'text ml  ')]")
    static
    WebElement WorkOrderNumber;
    @FindBy(xpath = "//button[@id='m15f1c9f0-pb']")
    WebElement CloseButton;
    @FindBy(xpath = "//span[@id='menu0_WO_MODULE_sub_changeapp_WOTRACK_a_tnode']")
    WebElement WorkOrderTrackingLink;
    @FindBy(xpath = "//input[@id='m6a7dfd2f_tfrow_[C:1]_txt-tb']")
    static
    WebElement WOfield;
    private static String WorkorderNumber;
    private  static  String date1;
    @FindBy(xpath = "//img[@id='m6a7dfd2f-ti2_img']")
    static
    WebElement WOsearchButton;
    @FindBy(xpath = "//span[@id='m6a7dfd2f_tdrow_[C:1]_ttxt-lb[R:0]']")
    WebElement ClickonWOlink;
    @FindBy(xpath = "//input[@id='m8b12679c-tb']")
    static
    WebElement ScheduleStartDateField;
    @FindBy(xpath = "//input[@id='m1576f23f-tb']")
    static
    WebElement ScheduleFinishDateField;
    @FindBy(xpath = "//img[@id='toolactions_SAVE-tbb_image']")
    static
    WebElement SaveButton;
    @FindBy(xpath = "//a[@id='m308a50dd-tab_anchor']")
    WebElement AssignmentTab;
    @FindBy(xpath = "//input[@id='m6798a95d_tdrow_[C:6]_txt-tb[R:0]']")
    WebElement LabourField;
   // @FindBy(xpath = "//img[@id='ROUTEWF__-tbb_image']")
    @FindBy(xpath = "//img[@role='button' and @alt='Route Workflow']")
    WebElement WorkflowButton;
    @FindBy(xpath = "//td[@id='m6a7dfd2f_tdrow_[C:5]-c[R:0]']")
    WebElement WorkOrderStatus;


    public PreventiveMaintenancePage() {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void searchPM() {
       PMsearchField.sendKeys("10374" + Keys.ENTER);
       // PMsearchField.sendKeys("10107" + Keys.ENTER);
       // PMsearchField.sendKeys("10048" + Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(PMlink)).click();

    }

    public void setPMCount() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(SetPMcounterLink)).click();
        NewPMcount.sendKeys("0");
        Thread.sleep(3000);
        OKbutton.click();
    }

    public void clickOnFrequencyTab() throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(FrequencyTab)).click();

    }

    public static String changeEstimatedNextDueDate() {
        EstimatedNextDueDate.clear();
        DateFormat dateFormat = new SimpleDateFormat("d/M/yy");
        Date date = new Date();
         date1 = dateFormat.format(date).trim();
        EstimatedNextDueDate.sendKeys(date1);
        return date1;
    }

    public void clickonGenerateWorkOrderButton() throws InterruptedException {
        Thread.sleep(2000);
      /*  JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", GenerateWorkOrdersLink);*/
        GenerateWorkOrdersLink.click();

    }

    public void setDueDate() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(WOsDueDate)).clear();
        WOsDueDate.sendKeys("30");
        OK.click();
    }

    public static String copyworkOrderNumber() throws InterruptedException, IOException {
        Thread.sleep(2000);
        String WO = WorkOrderNumber.getAttribute("innerHTML").trim();
        String[] WorkOrderNumber1 = WO.split(" ");
        String WONumber = WorkOrderNumber1[7].trim();
         WorkorderNumber = WONumber.replaceAll("\\..*", "");
        System.out.println("WorkOrderNumber is :" + WorkorderNumber);

        File file = new File("C:\\Users\\dmarella\\IdeaProjects\\FT_ST\\SmokeTest_FT_Results.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter FW1 = new FileWriter(file, true);
        BufferedWriter BW1 = new BufferedWriter(FW1);
        BW1.newLine();
        BW1.write("...Test..");
        BW1.newLine();
        BW1.write( "WorkOrderNumber is:" + WorkorderNumber); // Writing In To File.
        BW1.close();
        return WorkorderNumber;

    }

    public void clickonCloseButton() {
        CloseButton.click();
    }

    public void clickonWorkOrderTrackingLink() {
        WebDriverWait wait1 = new WebDriverWait(driver, 60);
        wait1.until(ExpectedConditions.elementToBeClickable(WorkOrderTrackingLink)).click();

    }

    public static void searchWorkOrder(String[] args) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(WOfield)).sendKeys(WorkorderNumber);
            WOsearchButton.click();
        }

        public void clickonWorkOrderLink(){
        ClickonWOlink.click();

    }

    public static void enterStartandFinishScheduleDates(String[] args) throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(ScheduleStartDateField)).sendKeys(date1);
        WebDriverWait wait1 = new WebDriverWait(driver, 60);
        wait1.until(ExpectedConditions.elementToBeClickable(ScheduleFinishDateField)).sendKeys(date1);
        WebElement element = SaveButton;
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

    }

    public void clickonAssignmentTab() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(AssignmentTab)).click();

    }
    public void enterLabourNumber() throws InterruptedException {
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(LabourField)).sendKeys("418590");
        Thread.sleep(1000);
        WebElement element1 = SaveButton;
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element1);

    }




    public void workflow() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(WorkflowButton)).click();
        Thread.sleep(1000);

    }
    public void verifytheWorkOrderStatus() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String actual = WorkOrderStatus.getText();
        Assert.assertEquals(actual , "DISPATCH");
    }

}