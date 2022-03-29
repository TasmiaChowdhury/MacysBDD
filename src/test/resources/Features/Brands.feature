Feature: Shop by brands functionality

  @chrome
  Scenario: The user should be able to shop by using brands filter
   Given User is in macys handbags page 
    When User click on brands
    And Click on GUESS
    Then User is navigated to GUESS brand page 
    When User Click on a product
    And Click to select a color 
    And Click on Add to Bag
    And Click on Checkout
    Then User is navigated to My Bag page 
    
    
    
  
    