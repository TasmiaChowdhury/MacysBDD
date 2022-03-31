#Author: Tasmia
Feature: Sign In Functionailty

  @chrome @smoke
  Scenario: User should not be able to sign in using invalid eamil and password
    Given User is on Macys sign is page
    When User enters a invalid email address
    And User enters a Valid password
    And User clicks on sign-in
    Then User should not be nevigated to Macys homepage
    And User  should receive an error message
