Feature: Show House in Tenant page

  Scenario: show the house
    Given that the tenant logged in
    And the tenant want to show all houses
    Then the houses appear to him
