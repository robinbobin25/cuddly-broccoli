@Suite
Feature: PC Featureaf

  @Done
  Scenario: Verify that user can open PC page
    Given I open pn.com.ua
    When I select "Компьютеры"
    Then I should see page url "http://pn.com.ua/computers/"

  @3
  Scenario: Verify that user can open PC page
    Given I open pn.com.ua
    When I select category "Компьютеры"
    Then verify that has sub-column
