@Suite
Feature: 1 'Test Atlas Copco Checkout End-to-End'

  @Story
  Scenario: The user can log in
    Given user clicks Login button on the Homepage
    When Login overlay is displayed
    Then user enters his valid credentials
    And Homepage is displayed with signed-in name

#  @Story
#  Scenario: The user wants to buy a product
#    Given the signed-in user is on Homepage
#    When user clicks on the Browse Catalog button
#    Then system navigates to Catalog Page
