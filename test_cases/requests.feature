#Feature: requests for advertisement of housing
#
#  Scenario Outline: add house
#  Given you are in admin page
#  When he see the info about the request house "<address>" , "<numRooms>",  "<numBathrooms>" , "<area>", "<rent>" , "<location>",  "<services>" , "<isAvailable>","<owner>" , "<tenantData>",  "<hasFurnitureWindow>" , "<rentPaymentDate>"
#  And select accept house
#  Then the house will be saved in the  house list requests and the add will be successfuly ....
#    Examples:
#      | address | numRooms | numBathrooms | area | rent | location | services | isAvailable | owner | tenantData | hasFurnitureWindow | rentPaymentDate |
#      | Sample St. | 3 | 2 | 200.2 | 1000.0 | Nablus | WiFi, Parking, Garden | false | Farah Musa| | true | 2023-07-01 |
#
#
#  Scenario Outline: remove house
#    Given you are in admin page
#    When he see the info about the request house "<address>" , "<numRooms>",  "<numBathrooms>" , "<area>", "<rent>" , "<location>",  "<services>" , "<isAvailable>","<owner>" , "<tenantData>",  "<hasFurnitureWindow>" , "<rentPaymentDate>"
#    And select cancel house
#    Then the house will be remove successfuly ....
#    Examples:
#      | address | numRooms | numBathrooms | area | rent | location | services | isAvailable | owner | tenantData | hasFurnitureWindow | rentPaymentDate |
#      | Sample St. | 3 | 2 | 200.2 | 1000.0 | Nablus | WiFi, Parking, Garden | false | Farah Musa| | true | 2023-07-01 |