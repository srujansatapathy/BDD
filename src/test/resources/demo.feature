Feature: Check the output
  Scenario: client makes call to GET /api/bdd
    When the client calls service
    Then the client receives status code of 200
    And the client receives response "This is return from BDD"