Feature: Orange HRM Login
 // As a user, I want to log in to Orange HRM so I can access my account.

  Scenario: Successful login
    Given I am on the Orange HRM login page
    When I enter username as "Admin"
    When I enter password as "admin123"
    And click the login button
    Then I should see the Orange HRM dashboard

 Scenario: Failed login
    Given I am on the Orange HRM login page
    When I enter username as "kannan"
    When I enter password as "kannan123"
    And click the login button
    Then I should see an error message
