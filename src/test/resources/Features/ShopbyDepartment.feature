#Author: Tasmia Chowdhury
Feature: shop by department feather

  @chrome
  Scenario: User should be able to shop by department
    Given user in macys homepage
    When user howver over to women department
    And user selected category dress
    Then user navigated to "https://www.macys.com/shop/womens-clothing/dresses?id=5449&cm_sp=us_hdr-_-women-_-5449_dresses_COL1"
