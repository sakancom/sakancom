Feature: generate rent for the house

  Scenario: Rental price per month
    Given  that the tenant is logged in
    When the tenant enter the order Id =0
    And the house coast = 300
    Then the total rent in the year =3600
    And the owner id = 5
    And the invoice will be generated
    And the order will set to paid

  Scenario: invoice will not generated
    Given that the tenant is logged in
    When the admin tenant not exist house Id=9 to invoiced
    Then the order Id is not exist on the recorded ordered
