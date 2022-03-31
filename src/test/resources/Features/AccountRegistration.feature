Feature: Registration functionality

  @sanity @chrome
  Scenario: The user should not be able to register for an account using invalid data
    Given User is on Macys sign-up page
    When the User inputs first name
    And inserts last name
    And User inserts an used email address
    And Inserts a password
    And User select month from the Birthday dropdown
    And Selects day from the Birthday dropdown
    And Click on the Create Account button
    Then User should receive an error message regarding used email
