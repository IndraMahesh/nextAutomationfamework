Feature: Register new user
  As a new user
  I should be able to register
  Scenario: Validate new user registration
    Given I'm on registration page
    When I enter firstname "firstname"
    And I enter lastname "lastname"
    And I enter EmailId "email"
    And I enter password "pwd"
    And I enter phone number "phone-no"
    And I click on register button
    Then I should be presented with the message as "Successfully registered"
