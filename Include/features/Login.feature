@Login @Smoke
Feature: Login 

  @LGN001
  Scenario: LGN001 - User Login With Valid Credential
    Given User already on login page
    When User input valid email
    And User input valid password
    And User click button login
    Then User should be successfully logged in
    
  @LGN002
  Scenario: LGN002 - User Login With Invalid Credential
    Given User already on login page
    When User input valid email
    And User input invalid password
    And User click button login
    Then User should not be logged in
    
   @LGN003
   Scenario: LGN003 - User Logout After Successfully Login
    Given User already on login page
    When User input valid email
    And User input valid password
    And User click button login
    And User click button menu
    And User click button logout
    Then User should be successfully logged out