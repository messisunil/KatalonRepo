Feature: test the functionality of login page

  @smoke
  Scenario Outline: check are you able to login to actitime with valid credentials
    Given navigate to actitime login page
    When enter <username> and <password>
    And click on login button
    Then Homepage will be displayed and logout from the actitime
    And close the browser

    @valid
    Examples: 
      | username | password |
      | admin    | manager  |

    @invalid
    Examples: 
      | username | password |
      | trainee  | trainee  |
