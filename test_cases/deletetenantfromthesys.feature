Feature: Delete tenant
  Scenario: delete done successfully
    Given that the admin choose to delete tenant
    When the entered tenant id is exist
    Then the tenant will deleted

  Scenario: delete fail
    Given that the admin choose to delete tenant
    When the entered tenant id is not exist int the recorded tenant
    Then the message that the tenant not exist will be shown
