Feature: Delete House
  Scenario: delete Successfully
    Given the House list have houses
    When the admin or owner want to delete house with id 0
    Then delete done

  Scenario: house not found
    Given that the owner or admin want to delete house with not valid id -1
    When the admin or owner want to delete it
    Then message appear to tell the them that is no house with this id