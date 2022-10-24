Feature: Mencoba data driven

  Scenario Outline: login menggunakan data
    Given browser open
    And user is on login page
    When user enters <username> and <password>
    And user click on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | bancet   |    12345 |
      | masyo    |    12345 |
