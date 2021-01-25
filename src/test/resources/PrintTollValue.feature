@tolls_table
Feature: Tolls table
    I want to access the tolls table

    Scenario: Login
    Given I tap on start button
    And I type my truck <plate> and  tap on next button
    When I type my <password> and I tap on finish button
    Then I should be on checkin page and I should see the permissions dialog

    Examples:
        |   plate    | password   |
        |  "DTY1986" | "R1234567" |