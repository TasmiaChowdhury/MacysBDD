#Author: Tasmia Chowdhury
Feature: End to end Mobile Testing

  @chrome
  Scenario: User should be able logIn, search for an item and successfully able to checkout the item from a Mobile Device
    Given User is in Macys log in page
    When User enters a valid eamil and valid password
    And User clicks on Sign in button
    Then User is able to successfully login into Macys homepage
    When hover over to Men from the top menu bar
    And User clicks on shirts
    And User Click choose a  desired shirt
    And User Click on desired color
    And User Click on desired size
    And User Click on Add To Bag
    And User Click on view Bag item
    And User click on checkout
    And User enter all valid information
    Then User able to checkout successfully
