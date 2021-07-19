@Search-Cars
Feature: Acceptance testing to validate if Search Cars is working fine.

  @Search-Cars-Positive
  Scenario: Validate search cars page
    Given I am on the homepage "https://www.carsguide.com.au/" of Cars Guide Website
    When I move to the menu
      | Menu          |
      | Cars for Sale |
      | Sell My Car   |
    And click on "Search Cars" link
    And select car brand as "BMW" from AnyMade dropdown list
    And select car model as "1 Series" from Any Model dropdown list
    And select location as "NSW - New England" from Any Location dropdown list
    And select price as "$1,000" from Price dropdown list
    And click on Find My Next Car button
    Then I should see a list of searched cars
    And the page title should be "Bmw 1 Series Under 1000 for Sale New England NSW | carsguide"