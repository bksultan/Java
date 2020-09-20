@regressiontest @TEC-1010
Feature: Validating headers

  @TEC-2012
  Scenario: Validating product information headers
    Given User navigates to WebOrders application
    When User provides username "username" and password "password"
    And User click on Order part
    Then User validates headers with "TestCases" excel file expected result
    And User updates "TestCases" with "PASS"