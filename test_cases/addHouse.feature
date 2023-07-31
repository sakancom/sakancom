Feature: the owner add a House for rent
  Scenario: add house successfully
    Given that the owner is logged in the system
    And there is a House with the following details:
      | id | address | numRooms | numBathrooms | area | rent | location | services | isAvailable | owner | tenantData | hasFurnitureWindow | rentPaymentDate |
      | 0 | Sample St. | 3 | 2 | 200.2 | 1000.0 | Nablus | WiFi, Parking, Garden | true | Farah Musa| | true | 2023-07-01 |
    Then the house will be saved in the  house list requests and the add will be successful

  Scenario: add house with no complete information about house
    Given that the owner is logged in
    And there is a House with no complete information
    Then the house will not be saved and error message will appear
