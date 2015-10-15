Feature Test Atlas Copco Checkout End-to-End Test

  @Andrey
  Scenario: The user can log in
    Given the user is on the Homepage
    When the user clicks on the Login button
    Then Login overlay is displayed
    And Username and Password fields are available
    When the user enters his valid credentials
    Then Homepage is displayed with signed-in name

  @Andrey
  Scenario: The user wants to sign in
    Given the user is on Homepage
    When the user clicks on the Login button
    Then Login overlay is displayed