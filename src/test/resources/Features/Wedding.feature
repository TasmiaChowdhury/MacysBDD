Feature: Wedding Registry functionality

  @chrome
  Scenario: User should be able to select a security question from drop menu to create registry
    Given User is in Macys Wedding and Registry page
    When User click on Create Your Registry
    Then User is navigated to Create registry page
    When Input valid email
    And Input password
    And Input password again
    And Click and Select a security question from dropdown
    And Input a answer
    And Click on Continue
    Then User is directed to the personal info page to add more info
