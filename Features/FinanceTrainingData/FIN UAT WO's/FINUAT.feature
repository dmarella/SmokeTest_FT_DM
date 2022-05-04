@FINUAT
Feature: SmokeTest

  Scenario: Creating an new ServiceRequest
    Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name             | Customer | Location | summary               | classification              | details                  | reportedByPhone | reportedByEmail | customerReference | customerReference2 |
      | Finance UAT Data | C1000007 | L1000537 | Finance UAT Data - WO | QUOTEINSP \ FABRIC \ QUOTE2 | Finance UAT Data Details | 07776023458     | test@email.com  | CUST123           | 7345               |
    And user clicks on 'Save ServiceRequest' button
    And user copy the SR Number
    And user clicks on 'Route Workflow' button and accept the alert

  Scenario: Verify the WorkOrder
    #When user clicks on 'Work' tab
    Then user verify the 'WorkOrder'Number
    And user search for WorkOrder
    And user add the labour details in 'Assignment' section
    And user clicks on 'Workflow' button

  Scenario: Move WorkOrder to Completed Status
    Then user verify the status of the WorkOrder changes to 'Dispatch'
    And user search for WorkOrder
    And user set the Actual Start Date for WorkOrder
    And user set the Actual Finish Date for WorkOrder
    And user applies the 'mobileoverride' option to WorkOrder
    And user 'save' the Work Order
    And user search for WorkOrder
    When user workflow the Workorder
    Then user verified that the workorder status move to 'Travel'
    And user search for WorkOrder
    When user workflow the Workorder
    Then user verified that the workorder status move to 'on site'
    When user workflow the Workorder
    Then user verified that the workorder status move to 'Start'
    When user workflow the Workorder
    Then user verified that the workorder status move to 'WOcomplete'
    When user workflow the Workorder
    Then user verified that the workorder status move to 'Completed'

  #Scenario:Adding Labour and travel time in Actuals
    #When user clicks on 'Actuals' tab
    #Then user verifies that 'Actuals' session
    #And user clicks on 'NewRow' button in labor section
    #And user add the labor and shift details for Travel type
    #When user clicks on Save button
    #And user clicks on 'NewRow' button in labor section
   # And user the labor and workstart and finish time for Work type
    #When user clicks on Save button

 # Scenario: Verifying the Actuals in Labor Reports
   # Then user verifies that the Actuals are added
   # And user veries that labor against the Workorder in Labor Reports













