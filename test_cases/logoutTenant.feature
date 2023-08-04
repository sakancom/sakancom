Feature: tenant logout

  Scenario: logout done successfully
    Given that the tenant choose to logout
    Then the tenant will be logout

  Scenario: logout fail
    Given that the tenant choose to logout
    Then the the tenant can't logout
