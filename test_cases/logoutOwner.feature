Feature: owner logout

  Scenario: logout done successfully
    Given that the owner choose to logout
    Then the owner will be logout

  Scenario: logout fail
    Given that the owner choose to logout
    Then the the owner can't logout
