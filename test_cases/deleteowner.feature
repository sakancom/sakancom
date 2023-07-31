Feature: Delete owner
Scenario: delete done successfully
Given that the admin choose to delete owner
When the entered owner id is exist
    Then the owner will deleted

  Scenario: delete fail
    Given that the admin choose to delete owner
    When the entered owner id is not exist int the recorded owner
Then the message that the owner not exist will be shown
