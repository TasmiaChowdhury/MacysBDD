Feature: End To End feature

  @chrome 
  Scenario: User should be able to select a shirt based on catagory and able to buy the desired shirt as guest.
    Given User is on Macy's home page.
    When Click on Men
    And Click on Shirt
    And Click on desired shirt
    And Click color black
    And Click on size S
    And Click on Add To Bag
    And Click Checkout
    Then user able to checkout successfully
