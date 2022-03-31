#Author: Tasmia Chowdhury
Feature: filtering sales and clearance

  @chrome
  Scenario: user should be able to filter sale and clearance based on need
    Given user is on home page.
    When user clicks on sales
    And user filter out the discount range
    Then user is able to see the products based on desired discount
