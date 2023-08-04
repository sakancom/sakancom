Feature: the admin can show the Houses in the system

  Scenario:  show houses
    Given that the admin is logged in the app
    And Houses list have houses
    Then the house will appear to admin page

  Scenario: No houses in the system
    Given that the admin is logged in the app
    And Houses list is Empty
    Then message appear to tell the admin that is no houses to show
