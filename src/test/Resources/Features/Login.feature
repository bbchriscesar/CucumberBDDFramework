@AllTest
Feature: Login
  Scenario Outline: Login Functionality
    Given user is already at the homepage
    And user logs in using Username "<username>" and Password "<password>"
    Then page title is "<pageTitle>"

    Examples:
      | username | password | pageTitle            |
      | mercury  | mercury  | Login: Mercury Tours |