@Test4UAT
Feature: SmokeTest

  Scenario: Creating an new ServiceRequest
    Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name      | Customer | Location | summary          | classification                                  | details | reportedByPhone | reportedByEmail | customerReference | customerReference2 |
      | SmokeTest-4 | C1000011 | L1001455 | Test SR creation | REACTIVE \ BUILDING FABRIC \ GLAZING \ GLASSEXT | Test4   | 07776023458     | test@email.com  | CUST123           | 7345               |
    And user clicks on 'Save ServiceRequest' button
    And user verifies the status of the newly created ServiceRequest
    And user copy the SR Number

  Scenario: Creating an WorkOrder
    Then user clicks on 'Route Workflow' button
    And user verifies the status of the newly created WorkOrder
    And user close the window

  @FSO
  Scenario: Verify the FSO Batch Run and WorkOrder updates visible in FSO
    Given user log in to FSO
    And user verify the location as set to 'Bristol'
    Then user clicks on 'Jobs' button
    And user search for  Work Order to assign the job
    And user verifies that the job as Dispatched correctly










