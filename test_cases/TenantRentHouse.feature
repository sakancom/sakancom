Feature: rent House

  Scenario: rent successfully
    Given that the tenant is logged in
    And the tenant want to rent the houses with id 0 and apartment number 1
    And this apartment is available
    Then the tenant rent it

  Scenario: the apartment is not available
    Given that the tenant is logged in
    And the tenant want to rent the houses with id 0 and apartment number 1
    And this apartment is not available
    Then the tenant cannot rent it
