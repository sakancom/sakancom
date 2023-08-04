Feature: the admin can show the Owners in the system

  Scenario:  show owners
    Given that the admin is logged in the system
    And owner list have owners
    Then the information of the owners will appear to admin page
