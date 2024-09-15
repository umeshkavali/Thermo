Feature: Creating a New User

  Scenario: New User Creation
    Given User navigates to Create a New Page
    Then User should handle the Popup Alert window
    And User should click on Sign in button
    Then User should click on Create Account link
    Then User should verify the Page Title as of "thermofisher.com Registration"
    Then User should verify the page is landed to "Why you should create an account page"
    When User should enter the following details to create a New User
      | Fields               | Values                          |
      | First name           | Testing                         |
      | Last name            |  T                             1 |
      | Email                | thermotesting001@mailinator.com |
      | Password             | Test@123                        |
      | Country or location: | India                           |
    Then User should select radio button
    Then User should click on Create account button
    And User should verify the "Verify your email address" text
    And User should click on Submit button
    Then User should verify the confirmation message
    And User should verify the "Thank you for creating an account" message
    When User should click on "Take me to my account" link
    Then User should verify the Page Title as of "Account Dashboard | Thermo Fisher Scientific - US"
    When User should click on Account
    Then User verify the Sign Out link
    Then User should verify the Page Title as of "Thermo Fisher Scientific - IN"
    Then Finally User should close the WebBrowser