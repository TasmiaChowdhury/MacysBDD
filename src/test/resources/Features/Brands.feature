Feature: Search by brands functionality

  @chrome
  Scenario: The user should be able to search products by using brands filter
   Given User is in macys handbags page 
    When User click on brands
    And Click on GUESS
    Then User is navigated to GUESS brand page 
    And User Click on a product
   
    
    
    
  
    