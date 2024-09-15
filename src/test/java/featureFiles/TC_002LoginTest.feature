Feature: LoginTest

  Scenario Outline: Login test with Valid and Invalid Credentials
    Given User navigates to Login Page
    Then User should enter the username as "<user>"
    Then User should enter the password as "<password>"
    And User should click on Login button
    Then User should verify the title as Thermo Fisher Scientific - IN
    And User should click on Account toggle
    And User should verify the Logout displayed on the page
    And User should click on Logout button
    Then Finally User should click on close the browser

    Examples: 
      | user              | password          |
      | umeshk@outlook.in | Umesh@062         |
      #| inCorrectUser     | Umesh@062         |
      #| umeshk@outlook.in | inCorrectPassword |
