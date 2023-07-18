#Feature: SignUp
#  Scenario Outline: One or More Empty Term
#    Given you are in signup page
#    When you write the "<id>", "<name>", "<PhoneNumber>", "<address>", "<city>", "<street>", "<email>" and "<password>" and "<usertype>"
#    Then you should show please fill all informations
#    Examples:
#      | id   | name | PhoneNumber | address | city     | street | email | password |usertype|
#      | 111 |       | 416         |         | Nablus   | jalood |       | 123456   |owner   |
#  Scenario Outline: duplicate id
#    Given you are in signup page
#    When you write the "<id>", "<name>", "<PhoneNumber>", "<address>", "<city>", "<street>", "<email>","<password>" and "<usertype>"
#    Then You should Show please enter another id
#    Examples:
#      | id  | name  | PhoneNumber | address     | city     | street | email                | password |usertype|
#      | 111 | Alaa  | 0594160463  | building 22 | Nablus   | jalood | alaahas345@gmail.com | 123456   |owner   |
#
#  Scenario Outline: weak password
#    Given you are in signup page
#    When you write the "<id>", "<name>", "<PhoneNumber>", "<address>", "<city>", "<street>", "<email>", "<password>" and "<usertype>"
#    Then You should Show please enter more than five character
#    Examples:
#      | id  | name  | PhoneNumber | address     | city     | street | email                | password |usertype|
#      | 111 | Alaa  | 0594160463  | building 22 | Nablus   | jalood | alaahas345@gmail.com | 123      |owner   |
#
#  Scenario Outline: Added Successfully
#    Given you are in signup page
#    When you write the "<id>", "<name>", "<PhoneNumber>", "<address>", "<city>", "<street>", "<email>" , "<password>"  and "<usertype>"
#    Then The Customer Added Successfully
#    Examples:
#      | id  | name  | PhoneNumber | address     | city     | street | email                | password |usertype|
#      | 111 | Alaa  | 0594160463  | building 22 | Nablus   | jalood | alaahas345@gmail.com | 123456   |owner   |
#
#
