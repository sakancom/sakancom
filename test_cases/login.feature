Feature: Admin login
  Description: the admin log in to the system
  Actor: Admin


  Scenario: Admin can login to system
    Given the Admin is not logged in to the system
    And  the password is equal to "1234"
    Then the Admin should log in succeed
    And the the Admin log to the system