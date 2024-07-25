Feature: Login flows

  Scenario: Login to application with valid credentials
    Given I launch the "amazon" application
    When I log into the application with valid credentials
    Then I see the home page