Feature: Search item
  As a user
  I should search and retrieve the relevant result

  @search
  Scenario: Validate search with valid search term
    Given I'm on home page "https://www.next.co.uk"
    When I enter search term "dresses"
    And I click search icon
    Then I should get relevant result with search heading as "Dresses"