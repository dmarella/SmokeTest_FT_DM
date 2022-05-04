@WorkOrderCreation_Northwales
Feature: Data_Loadtest

  Scenario: Creating an new ServiceRequest
    Given user log in to PreProduction Maximo System
    #Given user log in to Maximo System
    Then user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name           | Customer | Location | summary          | classification                                  | details           | reportedByPhone | reportedByEmail | customerReference | customerReference2 |
      | Mr.Load Tester | C1000323 | ppppppppppppppppppppppppppppppppppppppppp-0 | WO Data creation | REACTIVE \ BUILDING FABRIC \ GLAZING \ GLASSEXT | NorthWales Branch | 07776023458     | test@email.com  | 123               | 7345               |
    And user clicks on 'Save ServiceRequest' button
    Then user clicks on 'Route Workflow' button
    #And user verifies the status of the newly created WorkOrder
    Given user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name           | Customer | Location | summary          | classification                                  | details           | reportedByPhone | reportedByEmail | customerReference | customerReference2 |
      | Mr.Load Tester | C1000323 | L1021809 | WO Data creation | REACTIVE \ BUILDING FABRIC \ GLAZING \ GLASSEXT | NorthWales Branch | 07776023458     | test@email.com  | 123               | 7345               |
    And user clicks on 'Save ServiceRequest' button
    Then user clicks on 'Route Workflow' button
    #And user verifies the status of the newly created WorkOrder
    Given user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name           | Customer | Location | summary          | classification                                  | details           | reportedByPhone | reportedByEmail | customerReference | customerReference2 |
      | Mr.Load Tester | C1000323 | L1021809 | WO Data creation | REACTIVE \ BUILDING FABRIC \ GLAZING \ GLASSEXT | NorthWales Branch | 07776023458     | test@email.com  | 123               | 7345               |
    And user clicks on 'Save ServiceRequest' button
    Then user clicks on 'Route Workflow' button
    #And user verifies the status of the newly created WorkOrder
    Given user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name           | Customer | Location | summary          | classification                                  | details           | reportedByPhone | reportedByEmail | customerReference | customerReference2 |
      | Mr.Load Tester | C1000323 | L1021809 | WO Data creation | REACTIVE \ BUILDING FABRIC \ GLAZING \ GLASSEXT | NorthWales Branch | 07776023458     | test@email.com  | 123               | 7345               |
    And user clicks on 'Save ServiceRequest' button
    Then user clicks on 'Route Workflow' button
    #And user verifies the status of the newly created WorkOrder
    Given user clicks on 'GOTO' button
    Then user clicks on 'Service Desk' link
    And user clicks on 'Service Requests(SP)' link
    Then user navigated to 'Service Requests(SP)' page
    And user clicks on plus button to create a new Service Request form
    And user fill the new Service Request form
      | Name           | Customer | Location | summary          | classification                                  | details           | reportedByPhone | reportedByEmail | customerReference | customerReference2 |
      | Mr.Load Tester | C1000323 | L1021809 | WO Data creation | REACTIVE \ BUILDING FABRIC \ GLAZING \ GLASSEXT | NorthWales Branch | 07776023458     | test@email.com  | 123               | 7345               |
    And user clicks on 'Save ServiceRequest' button
    Then user clicks on 'Route Workflow' button
    #And user verifies the status of the newly created WorkOrder
