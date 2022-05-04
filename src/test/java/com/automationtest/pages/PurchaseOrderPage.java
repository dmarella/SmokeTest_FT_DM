package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class PurchaseOrderPage extends Testbase {
    @FindBy(xpath = "//span[contains(text() , 'Purchasing')]")
    WebElement PurchasingLink;
    @FindBy(xpath = "//span[contains(text() , 'Purchase Orders')]")
    WebElement PurchaseOrdersLink;
    @FindBy(xpath = "//img[@id='toolactions_INSERT-tbb_image' ]")
    WebElement PlusButton;
    @FindBy(xpath = "//input[@id='mbb05447d-tb']")
    WebElement Customer;
    @FindBy(xpath = "//img[@id='mbb05447d-img']")
    WebElement CustomerDetailMenuExpansionButton;
    @FindBy(xpath = "//span[@id='NORMAL_normal0_a_tnode']")
    WebElement SelectValueButton;
    @FindBy(xpath = "//input[@id='lookup_page1_tfrow_[C:1]_txt-tb']")
    WebElement NameSarchField;
    @FindBy(xpath = "//span[@id='lookup_page1_tdrow_[C:1]_ttxt-lb[R:0]']")
    WebElement MiltonCustomerLink;
    @FindBy(xpath = "//img[@id='m258485b0-img']")
    WebElement Agreement;
    @FindBy(xpath = "//*[@id='lookup_page1_tdrow_[C:1]_ttxt-lb[R:0]']")
    WebElement SelectValueDescriptionLink;
    @FindBy(xpath = "//input[@id='maa8ad01-tb2']")
    WebElement DescriptionField;
    @FindBy(xpath = "//img[@id='toolactions_SAVE-tbb_image' and @role='button']")
    WebElement SavePurachaseOrderButton;
    @FindBy(xpath = "//img[@id='mfe7bb84-img']")
    WebElement VendorCompanyExpansionButton;
    @FindBy(xpath = "//*[contains(text(), 'ONE ENVIRONMENTAL LTD')]")
    WebElement OneEnvironmentalLTD;


    public PurchaseOrderPage() {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        {
            PageFactory.initElements( driver, this );
        }

        try {
            prop = new Properties();
            FileInputStream ip1 = new FileInputStream(
                    "C:/Users/pbonthal/IdeaProjects/FT_SmokeTestPack/src/main/java/SmokeTest/testdata/TestData.properties");

            prop.load( ip1 );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void ClickonPuchaseOrderLink() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(PurchasingLink)).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 60);
        wait1.until(ExpectedConditions.elementToBeClickable(PurchaseOrdersLink)).click();
    }

    public void ClickonPlusButtontocreateaNewPO() {
      /*  WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(PlusButton));
        PlusButton.click();*/
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        try {
            WebElement button = PlusButton;
            button.click();
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            WebElement button = PlusButton;
            button.click();
        }
    }
    public void CustomerDetailsFilling(String Name) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        CustomerDetailMenuExpansionButton.click();
        SelectValueButton.click();
        NameSarchField.click();
        Thread.sleep(1000);
        NameSarchField.sendKeys(Name);
        Thread.sleep(1000);
        NameSarchField.sendKeys(Keys.ENTER);

            sleep(3000);
            WebElement element1 = MiltonCustomerLink;
            if (element1.isDisplayed() && element1.isEnabled()) {
                element1.click();
            }
    }

    public void AgreementDetailsFilling() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Agreement.click();
        Thread.sleep(1000);
        SelectValueButton.click();
        Thread.sleep(1000);
        SelectValueDescriptionLink.click();


    }

    public void DescriptionFilling() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        DescriptionField.clear();
        DescriptionField.click();
        String Datavalue = "SmokeTest Purchase Order";
        WebElement Finish = DescriptionField;
        Finish.clear();
        for (int i = 0; i < Datavalue.length(); i++) {
            char c = Datavalue.charAt(i);
            String s = new StringBuilder().append(c).toString();
            Finish.sendKeys(s);
        }


    }

    public void VendorDetailsFilling(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        VendorCompanyExpansionButton.click();
        SelectValueButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(OneEnvironmentalLTD));
        OneEnvironmentalLTD.click();


    }



    public void SavePurchaseOrder() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement SaveButton = SavePurachaseOrderButton;
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", SaveButton);
    }


}
