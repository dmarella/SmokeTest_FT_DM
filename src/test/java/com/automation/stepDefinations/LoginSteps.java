package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.LoginPage;
import cucumber.api.java.en.Given;
import org.junit.Test;

public class LoginSteps extends Testbase {

    LoginPage loginPage;

    public LoginSteps(){
        super(); }


    @Given("^user log in to Maximo System$")
    public void user_log_in_to_Maximo_System() throws Throwable {
       Testbase.intialization();
       loginPage = new LoginPage();
       loginPage.EnterUserName(prop.getProperty("Username"));
       loginPage.EnterPassword(prop.getProperty("Password"));
       loginPage.login();

    }

    @Given("^user log in to PreProduction Maximo System$")
    public void userLogInToPreProductionMaximoSystem() {
        Testbase.PrePRODintialization();
        loginPage =new LoginPage();
        loginPage.EnterUserName(prop.getProperty("Username"));
        loginPage.EnterPassword(prop.getProperty("Password"));
        loginPage.login();
        loginPage.PreProdLogin(prop.getProperty("Email"));

    }
}
