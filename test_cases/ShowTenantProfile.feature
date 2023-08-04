Feature: tenant profile

  Scenario: show tenant profile
    Given that the tenant is log in
    And the tenant has information email "jana@gmail",password "000", phone "0655433",address "nablus",name "jana", id 1 , age 24 ,universityMajors "sport" , hasFurnitureWindow "true",furniture "null");
    Then the tenant profile appear with his information

