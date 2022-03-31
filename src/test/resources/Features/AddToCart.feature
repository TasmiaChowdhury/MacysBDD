Feature: Add on Cart checkout functionality

  @chrome
  Scenario: User should be able to add item in cart
    Given User is on Macys selected product page
    When Click  color black
    And Click  on size S
    And Click  on Add To Bag
    Then Item adding confirmation page pops up
    When Click on View Bag
    Then User can find the product in the shopping bag
