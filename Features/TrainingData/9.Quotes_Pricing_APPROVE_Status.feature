@QUOTES2
  Feature: Data Creation

  Scenario: Creating an new ServiceRequest
    Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name        | Customer | Location | summary                                                | classification          | details                                                           | reportedByPhone | reportedByEmail       | customerReference | customerReference2 |
      | Mr Training | C1000011 | L1001455 | Customer Support Training  - Quotes ‘APPROVED’ status  | QUOTE \ FABRIC \ QUOTE2 | Quotes ‘APPROVED’ status (Which should have an auto generated WO) | 01908 4343443   | training@training.com | 12345             | 654321             |
    And user clicks on 'Save ServiceRequest' button
    And user verifies the status of the newly created ServiceRequest
    And user copy the SR Number

  Scenario: Creating an Quote
    Then user Workflow the ServiceRequest to create the Quote
    And user verifies the status of the newly created Quote

  Scenario: QM through Scoping
    Then user complete the QuoteManagment through Scoping
    And user Workflow the scoping section to Pricing section

  Scenario: Pricing Approve Quote
    Then user complete the pricing section
    And user Save the Quote


