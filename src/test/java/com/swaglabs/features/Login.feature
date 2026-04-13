Feature: Login functionality

  Scenario: Valid login
    Given User is on the login page
    When User enters valid username and password
    And User clicks Login button
    Then User should be navigated to the Products page
