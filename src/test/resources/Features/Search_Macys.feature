#Author: Tasmia
Feature: Macys search feature

  @chrome @smoke
  Scenario: User will be able to search an item on SearchBox
    Given User is on macys homepage
    When User enters items in search box
    And User press enter
    Then User is navigated to search result "Mens shirt"
