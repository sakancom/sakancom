Feature: the admin add the Houses from requests
  Scenario: add houses successfully
    Given that the administrator is logged in
    And request list have houses to rent
    Then the houses will be saved in the Houses list with in available state
    And the requests list will be empty

  Scenario: no requests to add houses
    Given that the administrator is logged in
    And request list dosn't have houses to rent
    Then the message appear to tell the admin that request list empty
