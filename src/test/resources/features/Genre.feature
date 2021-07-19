Feature: Genre

  @genre
  Scenario Outline: Navigate to a given Genre and play a given music
    Given I open the music and I'm on the home screen
    And I navigate to genre
    And I select a genre "<genre>"
    When I select a music "<music>"
    Then I validate the music plays.

    Examples:
      | genre     | music         |
      | Rock      | Home          |
      | Cinematic | On the Bach   |
      | Rock      | Drop and Roll |





