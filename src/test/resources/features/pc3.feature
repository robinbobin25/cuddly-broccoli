@Suite
Feature: PC Feature POX

  @Done
  Scenario: Verify that user can open PC page
    Given I open pn.com.ua
    When I loh
    Then I should see page url "http://pn.com.ua/computers/"

  @Done
  Scenario: Verify that user can open PC page
    Given I open pn.com.ua
    When I select category "Компьютеры"
    Then verify that has sub-column