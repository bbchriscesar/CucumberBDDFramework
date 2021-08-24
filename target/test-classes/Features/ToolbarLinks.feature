@AllTest
Feature: Toolbar links
  Scenario Outline: Toolbar links functionality
    Given user is already at the homepage
    And homepage title is "<pageTitle>"
    Then toolbar link is visible


    Examples:
     | pageTitle              |
     | Welcome: Mercury Tours |