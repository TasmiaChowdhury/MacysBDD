#Author: Tasmia
Feature: Sign In Functionailty

  @chrome @smoke
  Scenario: User should be able to sign in using valid eamil and password
    Given User is on Macys sign is page
    When User enters a valid email address
    And User enters a Valid password
    And User clicks on sign-in
    Then User should be nevigated to Macys homepage
