@PurchaseOrderCreation
Feature: SmokeTest

  Scenario: Creating an new ServiceRequest
    Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name | Customer | Location | summary          | classification                              | details   | reportedByPhone | reportedByEmail | customerReference | customerReference2 |
      | Test |          |          | Test SR creation | REACTIVE \ ELECTRICAL \ LIGHTING \ NOTWORKG | SmokeTest | 07776023458     | test@email.com  | 123               | 7345               |
    And user clicks on 'Save ServiceRequest' button
    And user verifies the status of the newly created ServiceRequest

  Scenario: Creating an WorkOrder
    Then user clicks on 'Route Workflow' button
    And user verifies the status of the newly created WorkOrder

  Scenario: Creating an PurchaseOrder
    Then user clicks on 'GOTO' button
    And user clicks on 'Purchasing' link
    And user clicks on 'Purchase Orders' link
    Then user clicks on plus button to create a new Purchase Order
    And user fill the new Purchase Order Details

    Scenario: Link WO and PO
      Then user click on 'POLines'Tab
      Then user add the NewRow
      And user fill the PurchaseOrder Lines
      Then user workflow the PurchaseOrder
      And user submit the PurchaseOrder for Approval process
      And user verify the status of the PurchaseOrder submitted







