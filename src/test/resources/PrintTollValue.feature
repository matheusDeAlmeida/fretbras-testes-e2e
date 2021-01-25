@tolls_table
Feature: Tolls talbe
    I want to access the tolls table

    Scenario: Login
    Given I tap on start button
    And I type my truck <plate> and  tap on next button
    When I type my <password> and I tap on finish button
    Then I should be on checkin page

    Examples:
        |   plate    | password |
        |  "DTY1986" | R1234567 |