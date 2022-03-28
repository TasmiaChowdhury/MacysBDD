Feature: User is able to Check rewards/points

  @chrome @Macys @Manual
  Scenario Outline: User should be able to check reward/points from users account
    Given On Macy’s login page
    When User vaild inputs userid "<userId>"
    And User inputs valid password "<password>"
    And Clicks on sign-in button
    And User clicks on user account
    Then User should be able to see user’s star reward

    Examples: 
      | userId                 | password    |
      | galaxyqa2022@gmail.com | Galaxy2022! |
