@HelpDesk_SR3
Feature: SmokeTest

  Scenario: Creating an new ServiceRequest
    Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name        | Customer | Location | summary                                            | classification                             | details                                               | reportedByPhone | reportedByEmail       | customerReference | customerReference2 |
      | Mr Training | C1000249 | L1016394 | Help Desk Training  New Status  B&Q HOUSE REACTIVE | REACTIVE \ BUILDING FABRIC \ DOORS \ GLASS | New Status   in any other contract and Classification | 019084343443    | training@training.com | 12345             | 654321             |
    And user clicks on 'Save ServiceRequest' button
    #And user verifies the status of the newly created ServiceRequest
    And user copy the SR Number


