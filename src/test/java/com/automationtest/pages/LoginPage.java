package com.automationtest.pages;

import com.automationtest.base.Testbase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends Testbase {
    @FindBy(id = "username")
    WebElement UsernameField;
    @FindBy(xpath = "//input[@id='password']")
    WebElement PasswordField;
    @FindBy(xpath = "//*[@id='loginbutton']")
    WebElement SignIntoMaximo;
    @FindBy(xpath = "//input[@name='Email']")
    WebElement PreProdLoginEmailField;
    @FindBy(xpath = "//input[@name='HomeRealmByEmail']")
    WebElement PreProdLoginNextButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void EnterUserName(String Username) {
        UsernameField.sendKeys(Username);

    }

    public void EnterPassword(String Password) {
        PasswordField.sendKeys(Password);

    }

    public HomePage login() {
        SignIntoMaximo.click();
        return new HomePage();

    }

    public void PreProdLogin(String Email) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        PreProdLoginEmailField.sendKeys(Email);
        PreProdLoginNextButton.click();
    }


}
