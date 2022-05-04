package com.automation.stepDefinations;

import com.automationtest.base.Testbase;
import com.automationtest.pages.HomePage;
import com.automationtest.pages.PreventiveMaintenancePage;
import com.automationtest.pages.ServiceRequestPage;
import com.automationtest.pages.WorkOrderPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class WorkOrderCreationSteps extends Testbase {
    HomePage homePage;
    ServiceRequestPage serviceRequestPage;
    WorkOrderPage workOrderPage;
    PreventiveMaintenancePage preventiveMaintenancePage;
    private String[] WorkOrderNumber;

    public WorkOrderCreationSteps() {
        super();
    }

    @Then("^user clicks on 'Route Workflow' button$")
    public void user_clicks_on_Route_Workflow_button() throws Throwable {
        serviceRequestPage = new ServiceRequestPage();
        serviceRequestPage.ClickonWorkflowButton();
        //serviceRequestPage.AccepttheAlert();
        serviceRequestPage.ClickonWorkTab();


    }

    @Then("^user verifies the status of the newly created WorkOrder$")
    public void user_verifies_the_status_of_the_newly_created_WorkOrder() throws Throwable {
        //serviceRequestPage.VerifyServiceStatusasQUEUED();
        workOrderPage = new WorkOrderPage();
        workOrderPage.ClickonWorkTab();
        workOrderPage.ClickonExpandWorkOrder();
        workOrderPage.CopyWorkOrderNumber();
        // workOrderPage.searchWO(WorkOrderNumber);


    }

    @And("^user close the window$")
    public void userCloseTheWindow() {
        Testbase.cleanUp();
    }

    @And("^user add the labour details in 'Assignment' section$")
    public void userAddTheLabourDetailsInAssignmentSection() throws InterruptedException {
        preventiveMaintenancePage = new PreventiveMaintenancePage();
        preventiveMaintenancePage.clickonAssignmentTab();
        preventiveMaintenancePage.enterLabourNumber();

    }

    @And("^user 'Save' and 'Workflow' the 'WorkOrder'$")
    public void userSaveAndWorkflowTheWorkOrder() throws InterruptedException {
        preventiveMaintenancePage.workflow();


    }

    @And("^user search for WorkOrder$")
    public void userSearchForWorkOrder() throws InterruptedException {
        homePage = new HomePage();
        homePage.searchforWorkOrder();
        workOrderPage = new WorkOrderPage();
        workOrderPage.searchandClickonWO(WorkOrderNumber);
    }


    @Then("^user verify the status of the WorkOrder changes to 'Dispatch'$")
    public void userVerifyTheStatusOfTheWorkOrderChangesToDispatch() throws InterruptedException {
        Thread.sleep(2000);
        homePage = new HomePage();
        homePage.searchforWorkOrder();
        workOrderPage = new WorkOrderPage();
        workOrderPage.searchandClickonWO(WorkOrderNumber);
        // workOrderPage.searchandClickonWO(WorkOrderNumber);

    }

    @When("^user workflow the Workorder$")
    public void userWorkflowTheWorkorder() throws InterruptedException {
        workOrderPage = new WorkOrderPage();
        workOrderPage.clickonWorkflowButton();

    }

    @When("^user workflow the WorkorderFINCOMP$")
    public void userWorkflowTheWorkorderFINCOMP() throws InterruptedException {
        workOrderPage = new WorkOrderPage();
        workOrderPage.clickonWorkflowButtonFINCOMP();


    }
}