@Sell-My-Car
Feature: Acceptance testing to validate if Sell My Car is working fine.

  @Sell-My-Car-Positive
  Scenario: Validate sell my car page
    Given I am on the homepage "https://www.carsguide.com.au/" of Cars Guide Website
    When I move to the menu
      | Menu          |
      | Cars for Sale |
      | Sell My Car   |
    And click on "Sell my car" link from the sell menu
    And enter number plate as "123" from Your Number Plate dropdown list
    And select state of car as "SA" from state of car registration dropdown list
    And click on Start my ad button
    And select car brand as "Ford" from Make dropdown list
    And select car model as "Corsair" from Model dropdown list
    And select car year as "1992" from Year dropdown list
    And select car body type as "Sedan" from Body Type dropdown list
    And select car transmission as "Manual" from Transmission dropdown list
    And select car fuel type as "Unleaded" from Fuel type dropdown list
    And select car variant as "GL" from Variant dropdown list
    And select car series as "UA" from Series dropdown list
    And click on Click your FREE ad
    Then the page title should be "Ford Corsair Under 1000 for Sale New England NSW | carsguide"
