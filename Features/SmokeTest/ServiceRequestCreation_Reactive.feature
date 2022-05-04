@ServiceRequestCreation_Reactive
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
      | Test |          |          | Test SR creation | REACTIVE \ ELECTRICAL \ LIGHTING \ NOTWORKG | SmokeTest | 07776023458     | test@email.com  | 123               | 7345               |
    And user clicks on 'Save ServiceRequest' button
    And user verifies the status of the newly created ServiceRequest


