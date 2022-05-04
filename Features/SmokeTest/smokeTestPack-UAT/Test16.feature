@Test16UAT @SmokeTestdemo
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
      | SmokeTest-8 | C1000011 | L1001455 | Test SR creation | QUOTEINSP \ FABRIC \ QUOTE2 | Test8   | 07776023458     | test@email.com  | CUST123           | CUST456            |
    And user clicks on 'Save ServiceRequest' button
    And user verifies the status of the newly created ServiceRequest
    And user copy the SR Number
    When user clicks on 'Work' tab
    Then user verify the 'WorkOrder'Number

