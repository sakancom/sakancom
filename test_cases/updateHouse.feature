Feature: Update House information
  Scenario: Update House rent Successfully
    Given that the owner is logged in
    And there is a House with id 0
    When the owner want to change the rent of the House to 1500.0
    Then the House's rent should be 1500.0 and the update done

  Scenario: Update House availability Successfully
    Given that the owner is logged in the system
    And there is a House with id equal 0
    When the owner want to change the availability of the House to false
    Then the House's availability should be false and the update done

  Scenario: Update The number of tenant Successfully
    Given that the owner is logged in the system
    And there is a House with id equal 0
    When the owner want to change the number of the tenant to 6
    Then the update done

