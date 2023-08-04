Feature: the admin can show the Tenants in the system

  Scenario:  show tenants
    Given that the admin is log in the app
    And tenant list have tenants
    Then the information of the tenants will appear to admin page
