Feature: Deposit

  Customer should be able to deposit amount

  @deposit
  Scenario: Customer logs in to the system
    Given customer is on home page
    And clicks customer login button
    And select the name from drop down and click login
    And click deposit category button
    And enter deposit amount "2000"
    And click deposit button
    Then verify amount has been deposited