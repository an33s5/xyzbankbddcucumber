Feature: Home Button

  Customer should be able to go to home from home button

  @homebtn
  Scenario: Customer can go to home page by home button
    Given customer is on home page
    And clicks customer login button
    And select the name from drop down and click login
    And clicks home button
    Then customer should be on home page