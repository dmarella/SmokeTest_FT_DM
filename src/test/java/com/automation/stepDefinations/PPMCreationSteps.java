package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.HomePage;
import com.automationtest.pages.PreventiveMaintenancePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class PPMCreationSteps extends PreventiveMaintenancePage {
    HomePage homePage;
    PreventiveMaintenancePage preventiveMaintenancePage;
    private String[] WorkorderNumber;
    private String[] date1;

    public PPMCreationSteps() {
        super();
    }

    @When("^Clicks on 'Preventive Maintenance'link$")
    public void clicksOnPreventiveMaintenanceLink() throws InterruptedException {
        homePage = new HomePage();
        homePage.ClickonPreventiveMaintenenceLink();
    }

    @Then("^user presents with Preventive Maintenance search page$")
    public void userPresentsWithPreventiveMaintenanceSearchPage() {
        preventiveMaintenancePage = new PreventiveMaintenancePage();
        preventiveMaintenancePage.searchPM();
    }

    @And("^user search for PM$")
    public void userSearchForPM() throws InterruptedException {
        preventiveMaintenancePage.setPMCount();
    }

    @And("^user clickS on PM$")
    public void userClickSOnPM() {
    }

    @When("^user 'Set PM Count' to (\\d+)$")
    public void userSetPMCountTo(int arg0) {
    }

    @And("^user change the Estimated date in Frequency Tab$")
    public void userChangeTheEstimatedDateInFrequencyTab() throws InterruptedException {
        preventiveMaintenancePage.clickOnFrequencyTab();
        preventiveMaintenancePage.changeEstimatedNextDueDate();
    }




    @Then("^user able to save the PM$")
    public void userAbleToSaveThePM() throws InterruptedException {
        preventiveMaintenancePage.clickonGenerateWorkOrderButton();

    }

    @And("^user able to Generate the Work Orders$")
    public void userAbleToGenerateTheWorkOrders() throws InterruptedException {
        preventiveMaintenancePage.setDueDate();



    }

    @And("^user Copy the Work Order number$")
    public void userCopyTheWorkOrderNumber() throws InterruptedException, IOException {
        preventiveMaintenancePage.copyworkOrderNumber();
        preventiveMaintenancePage.clickonCloseButton();
    }

    @When("^user search for the Work Order$")
    public void userSearchForTheWorkOrder() throws InterruptedException {
        homePage = new HomePage();
        homePage.ClickonGOTObutton();
        homePage.ClickonWorkOrderLink();
        preventiveMaintenancePage = new PreventiveMaintenancePage();
        preventiveMaintenancePage.clickonWorkOrderTrackingLink();
        preventiveMaintenancePage.searchWorkOrder(WorkorderNumber);
        preventiveMaintenancePage.clickonWorkOrderLink();
    }

    @And("^user add the 'Assignment' details to WO$")
    public void userAddTheAssignmentDetailsToWO() throws InterruptedException {

        preventiveMaintenancePage.enterStartandFinishScheduleDates(date1);
    }

    @Then("^user able to 'save' the Work Order$")
    public void userAbleToSaveTheWorkOrder() throws InterruptedException {
        preventiveMaintenancePage.clickonAssignmentTab();
        preventiveMaintenancePage.enterLabourNumber();
    }

    @When("^user workflow the Work Order$")
    public void userWorkflowTheWorkOrder() throws InterruptedException {
        preventiveMaintenancePage = new PreventiveMaintenancePage();
        preventiveMaintenancePage.workflow();
    }

    @Then("^user verify the Work Order status changes to 'Dispatch'$")
    public void userVerifyTheWorkOrderStatusChangesToDispatch() throws InterruptedException {
        homePage = new HomePage();
        homePage.ClickonGOTObutton();
        homePage.ClickonWorkOrderLink();
        preventiveMaintenancePage = new PreventiveMaintenancePage();
        preventiveMaintenancePage.clickonWorkOrderTrackingLink();
        Thread.sleep(20000);
        preventiveMaintenancePage.searchWorkOrder(WorkorderNumber);
        preventiveMaintenancePage.verifytheWorkOrderStatus();


    }
}

