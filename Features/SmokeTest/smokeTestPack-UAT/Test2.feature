@Test2UAT @SmokeTest
Feature: SmokeTest
Background:
Given user log in to Maximo System
  Scenario: Creat PPM
    #Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    When Clicks on 'Preventive Maintenance'link
    Then user presents with Preventive Maintenance search page
    And user search for PM
    And user clickS on PM
    When user 'Set PM Count' to 0
    And user change the Estimated date in Frequency Tab
    Then user able to save the PM
    And user able to Generate the Work Orders
    And user Copy the Work Order number
    When user search for the Work Order
    And user add the 'Assignment' details to WO
    Then user able to 'save' the Work Order
    When user workflow the Work Order
    Then user verify the Work Order status changes to 'Dispatch'















