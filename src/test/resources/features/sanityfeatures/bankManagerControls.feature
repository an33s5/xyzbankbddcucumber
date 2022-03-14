Feature: Bank Manager Controls

  @managercontrols
  Scenario: Bank manager can add customers, open account, and view customers
    Given customer is on home page
    And clicks bank manager button
    Then verify bank manager controls are displayed