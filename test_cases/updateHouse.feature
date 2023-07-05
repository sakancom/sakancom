Feature: Update House information
  Scenario: Update House rent Successfully
    Given that the administrator is logged in
    And there is a House with id 1
    When the admin want to change the rent of the House to 1500.0
    Then the House's rent should be 1500.0 and the update done

  Scenario: Update House availability Successfully
    Given that the administrator is logged in the system
    And there is a House with id equal 1
    When the admin want to change the availability of the House to false
    Then the House's availability should be false and the update done

  Scenario: Update House tenantData Successfully
    Given that the administrator is log in
    And there is House with id 1
    When the admin want to change the tenantData of the House as table:
     | tenantData |
     | null  |
    Then the tenantData should be null

  Scenario: Update House rent with id not exist
    Given that the administrator is in system
    And the admin want to update house with id -1
    When the admin want to update the rent of the House to be 1500.0
    Then the update can't complete and the error message will appear

  Scenario: Update House availability with id not exist
    Given that the administrator is log in successfully
    And the admin want to update house with id equal -1
    When the admin want to update the availability of the House to be false
    Then the update can't done and the error message will appear

  Scenario: Update House tenantData with id not exist
    Given that the administrator is logged in the system successfully
    And there is a House the admin want to update  with id  -1
    When the admin want to change the tenantData of the House to ba as the table shows
      | tenantData |
      | null  |
    Then the update can't complete and the error message will appear to admin