Feature: End To End feature
  
  //@Regression
  @chrome @sayed
  Scenario: As a user I want to order a shirt. 
    Given User is on Macys.com home page.
    When Click on Men
    And Click on Shirt
    And Click on desired shirt
    And Click color black
    And Click on size S
    And Click on Add To Bag
    And Click Checkout
    Then user able to checkout successfully  
    