Feature: Linkedin

  Scenario: User Log In
    Given Linkedin Login Page
    When I enter email and password
    Then Page redirected to Homepage
    And I'm succesfully logged in

  Scenario: Search jobs
    Given I'm on Linkedin Home Page
    When I enter "Front End" on search textbox
    Then Page show search result of "Front End" with job title

  Scenario: Notifications
    Given I'm on Linkedin Home Page
    When I press notification page icon
    Then Page redirected to Notification Page