Feature: Login verification for saucedemo

  Scenario Outline: check the login page with valid credentials
    Given open the browser navigate to saucedemo login page
    When enter the login credentials as <user> and <pass>
    And click login button
    Then sauce homepage should be displayed
    And close the browser

    Examples: 
      | user          | pass         |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
