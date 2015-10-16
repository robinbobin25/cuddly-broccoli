@Suite
Feature: 1 'Test Atlas Copco Checkout End-to-End'

  @Story
  Scenario: The user can log in
    Given user is on the Homepage
    When user clicks on the Login button
    Then Login overlay is displayed
    And Username and Password fields are available
    When user enters his valid credentials
    Then Homepage is displayed with signed-in name

  @Story
  Scenario: The user wants to buy a product
    Given the signed-in user is on Homepage
    When user clicks on the Browse Catalog button
    Then system navigates to Catalog Page
