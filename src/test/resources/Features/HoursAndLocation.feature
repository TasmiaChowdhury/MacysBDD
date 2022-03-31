#Author: Tasmia Chowdhury
Feature: Hours & location feature

  @chrome
  Scenario: Should should be able to see store Hours and nearest Location
    Given User is on macys homepage
    When User Scrol Down to all the way bottom of the page
    And User select hours and Location
    Then User should be able to see Store hour and nearst store location
