Feature: tenant login

  Scenario: Successful log in
    Given that the tenant is not logged in the app
    And the username tenant is "jana@gmail"
    And the password tenant is "000"
    Then  the tenant is logged in the app successfully

  Scenario: tenant entered a wrong username
    Given that the tenant is not logged in the app
    And the username tenant is "wrong"
    And the password tenant is "000"
    Then the tenant will not login
    And the message appear to tell the tenant what's wrong

  Scenario: tenant entered a wrong password
    Given that the tenant is not logged in the app
    And the username tenant is "jana@gmail"
    And the password tenant is "wrong"
    Then the tenant will not login
    And the message appear to tell the tenant what's wrong

  Scenario: tenant entered empty password or email
    Given that the tenant is not logged in the app
    And the username tenant is " "
    And the password tenant is " "
    Then the tenant will not login
    And the message appear to tell the tenant what's wrong
