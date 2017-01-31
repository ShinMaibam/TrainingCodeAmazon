#Author: your.email@your.domain.com
Feature: To validate Amazon Home screen functionality

  @pri1
  Scenario Outline: TC01 - validate search key display
    Given user launch desire website
    When user search for item '<search_item>'
    Then user should see search key '<search_item>' next to search result numbers

    Examples: 
      | search_item   |
      | iPhone7s Plus |

  @Lei1
  Scenario: TC02 - Amazon User Sign In
    Given user launch desire website
    Then user click on Your Account link
    Then Sign In page display
    Then user enter email id and password
    Then click on Sign In button

  @lei2
  Scenario Outline: TCO3 - Create Amazon Account - Click Here
    Given user launch desire website
    Then user hover mouse to hello sign in and select click here link
    Then create amazon account page display
    Then enter your new account details '<name>' '<email>' '<pwd>' '<con_fpwd>'
    Then click create your amazon account button

    Examples: 
      | name    | email                  | pwd       | con_fpwd  |
      | Tester1 | nong_test002@gmail.com | password1 | password1 |
      | Tester2 | nong_test003@gmail.com | password1 | password1 |
