@FA_BillBatch
Feature: Data Creation

  Scenario: Creating an new ServiceRequest
    Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name           | Customer | Location | summary       | classification                             | details   | reportedByPhone | reportedByEmail       | customerReference | customerReference2 |
      | Mr Load Tester | C1000007 | L1000537 | Load Test WOs | REACTIVE \ ELECTRICAL \ FIXTURE \ NOTWORKG | BillBatch | 01908 4343443   | training@training.com | 12345             | 654321             |
    And user clicks on 'Save ServiceRequest' button
    And user copy the SR Number
    And user clicks on 'Route Workflow' button and accept the alert

  Scenario: Verify the WorkOrder
    When user clicks on 'Work' tab
    Then user verify the 'WorkOrder'Number
    And user search for WorkOrder
    And user add the labour details in 'Assignment' section
    And user clicks on 'Workflow' button
  #Scenario: Move WorkOrder to Completed Status
    #Then user verify the status of the WorkOrder changes to 'Dispatch'



















