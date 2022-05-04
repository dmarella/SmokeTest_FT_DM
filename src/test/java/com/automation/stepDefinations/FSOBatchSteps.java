package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.FSOPage;
import com.automationtest.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FSOBatchSteps extends Testbase {
    FSOPage fsoPage;

    public FSOBatchSteps() {
        super();

    }

    @Given("^user log in to FSO$")
    public void userLogInToFSO() {
        Testbase.FSOintialization();
        fsoPage = new FSOPage();
        fsoPage.EnterFSOUserName(prop.getProperty("FSOUsername"));
        fsoPage.EnterFSOPassword(prop.getProperty("FSOPassword"));
        fsoPage.FSOlogin();
    }

    @When("^user Able to view and assign work to an Engineer$")
    public void userAbleToViewAndAssignWorkToAnEngineer() {
    }

    @Then("^user able view Work Order updates are visible in FSO$")
    public void userAbleViewWorkOrderUpdatesAreVisibleInFSO() {
    }

    @And("^user verify the location as set to 'Bristol'$")
    public void userVerifyTheLocationAsSetToBristol() throws InterruptedException {
        fsoPage.ChangethelocationtoBristol();
    }

    @Then("^user clicks on 'Jobs' button$")
    public void userClicksOnJobsButton() {
        fsoPage.searchforWorkOrder();
        fsoPage.clickonWorkOrderLink();
    }

    @And("^user search for  Work Order to assign the job$")
    public void userSearchForWorkOrderToAssignTheJob() {
        fsoPage.clickonAssignJobLink();
        fsoPage.assignjobandSave();
    }

    @And("^user verifies that the job as Dispatched correctly$")
    public void userVerifiesThatTheJobAsDispatchedCorrectly() {
    }

}



