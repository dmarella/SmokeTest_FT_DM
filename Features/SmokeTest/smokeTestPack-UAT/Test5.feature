@Test5UAT
Feature: SmokeTest
 # Note to deepika
  Scenario: Creating an new FMR
    Given user log in to Maximo System
    #Then user clicks on 'GOTO' button
   # And  user clicks on ' WorkOrder'link
    When user clicks on ' Forward Maintenance Register' link
    Then Forward Maintenance Register page display
    And user fill the 'Forward Register Maintenance' page
      | Description | Customer | Location | OwnerGroup | EstimatedTotalPrice | CustomerReferenceNumber |
      | SmokeTest-5 | C1000011 | L1001455 | FMRGRP     | 10000               | CUST1234                |
    When user clicks on 'Save' button
    #Then user verifies that a new FMR created

  Scenario: Move the FMR to Quotation
    When user click on ' Move to Quation' button
    Then a new Quote created under Associated Quotes section
    And the FMR status change to 'Approved' from 'WAPPR'

  Scenario:Quotation Scoping and Pricing
    Then user search for the newly created Quote
    And user verifies the quote details are matching

  Scenario: QM through Scoping
    Then user complete the QuoteManagment through Scoping for FMR
    And user Workflow the scoping section to Pricing section

  Scenario: Place an FMR Quote
    Then user complete the pricing section
    And user workflow the quote
    And user place the quote on FMR
    And user verifies the quote status as 'Closed'




