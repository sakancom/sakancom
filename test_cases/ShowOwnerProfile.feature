Feature: owner profile

  Scenario: show owner profile
    Given that the owner is log in
    And the owner has information password "000" ,email "shahd@gmail" , phone "098866",address "nablus", name "shahd", id 2;
    Then the owner profile appear with his information

