package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class ForwardMainteananceRegisterPage extends Testbase {
    @FindBy(css = "#titlebar-tb_appname")
    WebElement ForwardMaintenanceRegisterPage;
    @FindBy(css = "#mb64692d3-tb2")
    WebElement DescriptionField;
    @FindBy(css = "#mc62c665c-tb")
    WebElement CustomerField;
    @FindBy(css = "#m2f4fc369-tb")
    WebElement LocationField;
    @FindBy(xpath = "//input[@id='mdedc8151-tb']")
    WebElement OwnerGroupField;
    @FindBy(xpath = "//input[@id='m37bf2464-tb']")
    WebElement EstimatedTotalPriceField;
    @FindBy(css = "#m40b814f2-tb")
    WebElement CustomerReference;
    @FindBy(xpath = "//img[@id='mb64692d3-img2']")
    WebElement LongDescriptionbutton;
    @FindBy(xpath = "//*[@id='ma6499a9c-rte_iframe']")
    WebElement LongDescriptionTextBox;
    @FindBy(xpath = "//button[@id='m74031266-pb']")
    WebElement OKbutton;
    @FindBy(xpath = "//img[@id='toolactions_SAVE-tbb_image']")
    WebElement SaveButton;
    @FindBy(xpath = "//input[@id='m30d2e07d-tb']")
    WebElement StatusField;
    @FindBy(xpath = "//*[contains(text(),'Move to Quotation')]")
    WebElement MoveToQuotationLink;
    @FindBy(xpath = "//button[@id='me1720906-pb']")
    WebElement ProceedtoQuoteSystemmessage;
    @FindBy(xpath = "//button[@id='m88dbf6ce-pb']")
    WebElement OkSystemmessage;
    @FindBy(xpath = "//input[@id='mb64692d3-tb']")
    static
    WebElement FMRnumber;
    @FindBy(xpath = "//*[@id='quicksearchQSImage']")
    static
    WebElement QuickSearchImage;
    @FindBy(xpath = "//input[@id='m27cde50f-tb']")
    static
    WebElement FMRsearch;
    @FindBy(xpath = "//button[@id='m10f985e2-pb']")
    static
    WebElement FindButton;
    @FindBy(xpath = "//td[@id='msgbox-co2_1']")
    static
    WebElement Quote;
    @FindBy(xpath = "//input[@id='m6a7dfd2f_tfrow_[C:1]_txt-tb']")
    static
    WebElement QuoteField;
    private static String QuoteNumber;
    @FindBy(xpath = "//img[@id='m6a7dfd2f-ti2_img']")
    static
    WebElement QuoteSearch;
    @FindBy(xpath = "//*[@id='m6a7dfd2f_tdrow_[C:1]_ttxt-lb[R:0]']")
    static
    WebElement QuoteNumberLink;
    private static String FMR;
    @FindBy(xpath = "//*[@id='m2f4fc369-img']")
    WebElement DetailMenu;
    @FindBy(linkText = "Select Value")
    WebElement SelectValue;
    @FindBy(xpath = "//span[@id='lookup_page1_tdrow_[C:0]_ttxt-lb[R:0]']")
    WebElement Location;
    @FindBy(xpath = "//*[@id='mc62c665c-tb2']")
    WebElement CustomerFieldText;
    @FindBy(xpath = "//*[@id='me1720906-pb']")
    WebElement YesButton;

    public ForwardMainteananceRegisterPage() {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    public void VeifytheForwardMainteananceRegisterPage() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String Pagetext = ForwardMaintenanceRegisterPage.getText().trim();
        Assert.assertEquals(Pagetext, "Forward Maintenance Register");
    }

    public void EnterDescriptionDetails(String Description) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        DescriptionField.clear();
        wait.until(ExpectedConditions.elementToBeClickable(DescriptionField)).sendKeys(Description);
        sleep(1000);
    }

    public void EnterCustomerDetails(String Customer) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        CustomerField.clear();
        Thread.sleep(2000);
        WebElement element = CustomerField;
        element.clear();
        for (int i = 0; i < Customer.length(); i++) {
            char c = Customer.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);

        }
    }
    public void EnterLocationDetails(String Location) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        LocationField.clear();
        Thread.sleep(2000);
        WebElement element = LocationField;
        element.clear();
        for (int i = 0; i < Location.length(); i++) {
            char c = Location.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);
        }
    }
    public void ReEnterLocation() throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", DetailMenu);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", SelectValue);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", Location);
    }

    public void ClickonYesButton() throws InterruptedException {
        Thread.sleep(2000);
       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", YesButton);*/
        YesButton.click();
    }

    public void EnterOwenerGroupDetails(String OwenerGroup) throws InterruptedException {
        sleep(2000);
        WebElement element = OwnerGroupField;
        element.clear();
        for (int i = 0; i < OwenerGroup.length(); i++) {
            char c = OwenerGroup.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);
        }
    }

    public void EnterEstimatedTotalPriceDetails(String EstimatedTotalPrice) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = EstimatedTotalPriceField;
        element.clear();
        for (int i = 0; i < EstimatedTotalPrice.length(); i++) {
            char c = EstimatedTotalPrice.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);
        }
    }

    public void EnterCustomerReference(String CustomerReferenceNumber) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(CustomerReference)).sendKeys(CustomerReferenceNumber);
        sleep(1000);
    }

    public void EnterlongDescription() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        LongDescriptionbutton.click();
        OKbutton.click();
    }

    public void SavetheFMR() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        SaveButton.click();
    }

    public void FMRStatusWAPPR() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String status = StatusField.getAttribute("value");
        String actual = "WAPPR";
        Assert.assertEquals(status, actual);
    }

    public void ClickonMovetoQuotationLink() throws InterruptedException {
     /*   JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", MoveToQuotationLink);*/
        Thread.sleep(2000);
        MoveToQuotationLink.click();
       /* Actions act = new Actions(driver);
        act.moveToElement(ProceedtoQuoteSystemmessage).click().build().perform();
        ProceedtoQuoteSystemmessage.click();*/
        /*Actions act1 = new Actions(driver);
        act1.moveToElement(OkSystemmessage).click().build().perform();
        OkSystemmessage.click();*/
    }
    public void ClickonOKbutton() throws InterruptedException {
        Thread.sleep(3000);
       /* Actions act1 = new Actions(driver);
        act1.moveToElement(OkSystemmessage).click().build().perform();
        if (OkSystemmessage.isEnabled()){
            OkSystemmessage.click();*/

        try {
            WebElement button = OkSystemmessage;
            button.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            WebElement button = OkSystemmessage;
            button.click();
        }
        }


    public static String CopyFMRnumber() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        FMR = FMRnumber.getAttribute("value");
        System.out.println("FMR Number is:" + FMR);
        File file = new File("C:\\Users\\dmarella\\IdeaProjects\\FT_ST\\SmokeTest_FT_Results.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter FW = new FileWriter(file, true);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.newLine();
        BW.write("...Test..");
        BW.newLine();
        BW.write("FMR Number is:" + FMR); // Writing In To File.
        BW.close();
        return FMR;
    }

    public static void SearchFMR(String[] args) throws InterruptedException {
        Thread.sleep(2000);
        QuickSearchImage.click();
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(FMRsearch));
        FMRsearch.sendKeys(FMR);
        FindButton.click();
    }

    public static String CopyQuoteNumber() throws IOException, InterruptedException {
        Thread.sleep(2000);
        String QuoteNumber1;
        QuoteNumber1 = Quote.getText();
        //System.out.println("QuoteNumber is:" + QuoteNumber);
        String[] Quote1 = QuoteNumber1.split(" ");
        QuoteNumber = Quote1[4];
        System.out.println("QuoteWorkOrderNumber is :" + QuoteNumber);
        File file = new File("C:\\Users\\dmarella\\IdeaProjects\\FT_ST\\SmokeTest_FT_Results.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter FW = new FileWriter(file, true);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.newLine();
        // BW.write("...Test..");
        BW.newLine();
        BW.write("QuoteNumber is:" + QuoteNumber); // Writing In To File.
        BW.close();
        return QuoteNumber;
    }

    public static void searchquote(String[] args) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        QuoteField.sendKeys(QuoteNumber);
        QuoteSearch.click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(QuoteNumberLink)).click();
    }
}