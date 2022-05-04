@PO_Service_APPR
Feature: Finane Data Creation

  Scenario: Creating an PurchaseOrder
    Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    And user clicks on 'Purchasing' link
    And user clicks on 'Purchase Orders' link
    Then user clicks on plus button to create a new Purchase Order
    And user fill the new Purchase Order Details

  Scenario: Add PurchaseLine Details
    Then user click on 'POLines'Tab
    Then user add the NewRow
    And user fill the PO Lines
    Then user workflow the PurchaseOrder
    And user submit the PurchaseOrder for Approval process
    And user verify the status of the PurchaseOrder submitted










