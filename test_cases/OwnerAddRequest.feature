Feature: Add Request

  Scenario: add House to request list successfully
    Given that the owner is loged in
     And there is a house with id 1, location "nablus", services "null", owner "null", totalApartments 3, apartments "null", photo "url" and numOfFloor 2
    Then the House will be saved in the request list

