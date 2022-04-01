Feature: Authorize

  Scenario: Basic Authorization
    Given Authorization Modals View
    When I enter username and password
    And Click Authorize Button
    Then Credentials Authorized with corresponding username and password