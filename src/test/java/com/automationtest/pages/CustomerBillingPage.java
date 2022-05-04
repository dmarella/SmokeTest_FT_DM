package com.automationtest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CustomerBillingPage extends WorkOrderPage {
    public static String WorkOrderNumber;
    public static String BillBatchNO;
    @FindBy(xpath = "//img[@id='toolactions_INSERT-tbb_image']")
    WebElement PlusButton;
    @FindBy(css = "#mf9480301-tb2")
    WebElement BillBatchDescriptionField;
    @FindBy(css = "#m604152bb-tb")
    WebElement BillBatchCustomerField;
    @FindBy(css = "#m7fdc71af-tb")
    WebElement BillEndDateField;
    @FindBy(css = "#m1746622d-img")
    WebElement BillBatchAgreement;
    @FindBy(xpath = "//span[@id='NORMAL_normal0_a_tnode']")
    WebElement SelectValue;
    @FindBy(css = "#lookup_page1_tdrow_\\[C\\:1\\]_ttxt-lb\\[R\\:0\\]")
    WebElement AgreementLink;
    @FindBy(css = "#m88dbf6ce-pb")
    WebElement SystemMessageOK;
    @FindBy(css = "#mcf850bc1_bg_button_selectworkordertobill-pb")
    WebElement BillBatchSelectWorkOrderButton;
    @FindBy(css = "#m9a787af-tb")
    static
    WebElement WorkOderField;
    @FindBy(css = "#mf677964e-cb_img")
    WebElement CopyBillLinesCheckbox;
    @FindBy(css = "#m1691ae4c-pb")
    WebElement OKbutton;
    @FindBy(xpath = "//*[@id='me9386ecd-pb']")
    WebElement OKSTATUS;
    @FindBy(css = "#mf9480301-tb")
    static
    WebElement BillBatchNumberField;
    @FindBy(css = "#m6a7dfd2f_tfrow_\\[C\\:1\\]_txt-tb")
    static
    WebElement BillBatchField;
    @FindBy(css = "#m6a7dfd2f-ti2_img")
    static
    WebElement BillBatchSearchButton;
    @FindBy(css = "#m6a7dfd2f_tdrow_\\[C\\:1\\]_ttxt-lb\\[R\\:0\\]")
    WebElement BillBatchLink;
    static WorkOrderPage workOrderPage;
    @FindBy(xpath = "//*[@id='m6a7dfd2f_tfrow_[C:5]_txt-tb']")
    WebElement BillStatus;
    @FindBy(xpath = "//*[@id='m3a664f1e_tdrow_[C:10]_hyperlink-lb[R:0]_image']")
    WebElement ChangeStatus;
    @FindBy(xpath = "//img[@id='m8ddb310e-img']")
    WebElement NewStatusDropdown;
    @FindBy(xpath = "//*[@id='menu0_APPROVED_OPTION_a_tnode']")
    WebElement ApprovedByCustomer;

    public CustomerBillingPage() {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public static String CopyBillBatchNumber() throws IOException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         BillBatchNO = BillBatchNumberField.getAttribute("value");
        System.out.println("BillBatch Number is :" + BillBatchNO);
        File file = new File("C:\\Users\\dmarella\\IdeaProjects\\FT_ST\\SmokeTest_FT_Results.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter FW = new FileWriter(file, true);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.newLine();
        //BW.write("...Test..");
        BW.newLine();
        BW.write("BillBatch Number is :" + BillBatchNO); // Writing In To File.
        BW.close();
        return BillBatchNO;


    }

    public void clickonPlusButtontoCreateNewBillBatch() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement element = PlusButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);
    }

    public void enterDescription() {
                      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                String Description = "Test";
                WebElement Finish = BillBatchDescriptionField;
                Finish.clear();
                for (int i = 0; i < Description.length(); i++) {
                    char c = Description.charAt(i);
                    String s = new StringBuilder().append(c).toString();
                    Finish.sendKeys(s);

        }
    }

    public void enterCustomerField() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String Customer = "C1000011";
        WebElement element = BillBatchCustomerField;
        element.clear();
        for (int i = 0; i < Customer.length(); i++) {
            char c = Customer.charAt(i);
            String s = new StringBuilder().append(c).toString();
            element.sendKeys(s);
            Thread.sleep(1000);
        }
    }

    public void enterEndBillDate() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        DateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = new Date();
        String date1 = dateFormat.format(date).trim();
        WebElement EndDate = BillEndDateField;
        EndDate.clear();
        for (int i = 0; i < date1.length(); i++) {
            char c = date1.charAt(i);
            String s = new StringBuilder().append(c).toString();
            EndDate.sendKeys(s);
            Thread.sleep(1000);
        }

    }

    public void enterAgreement() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement element = BillBatchAgreement;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);
        WebElement element1 = SelectValue;
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", element1);
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.moveToElement(AgreementLink).click().build().perform();
        Thread.sleep(2000);
        Actions act1 = new Actions(driver);
        act1.moveToElement(SystemMessageOK).click().build().perform();


    }

    public void clickonSelectWorkOrdersButton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement element = BillBatchSelectWorkOrderButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);

    }

    public void uncheckCopyBillLines() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        if (CopyBillLinesCheckbox.isSelected()) {
            CopyBillLinesCheckbox.click();

        }

    }

    public void clickonOKbutton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement element = OKbutton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);

    }

    public static void enterBillBatchNumber(String[] args) throws InterruptedException {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(BillBatchField)).sendKeys(BillBatchNO);
        Thread.sleep(2000);
        BillBatchField.sendKeys(Keys.ENTER);
        //BillBatchSearchButton.click();

    }

    public void clickonBillBatchLink() throws InterruptedException {
        Thread.sleep(2000);
        Actions act1 = new Actions(driver);
        act1.moveToElement(BillBatchLink).click().build().perform();

    }

    public void cleartheBillStatus() throws InterruptedException {
        Thread.sleep(2000);
        BillStatus.clear();
    }
    public void ClickonChangeStatusButton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = ChangeStatus;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);
        ChangeStatus.click();

    }

    public void selecttheNewStatus() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = NewStatusDropdown;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);
        ApprovedByCustomer.click();
        Thread.sleep(1000);
        OKSTATUS.click();
    }


}







