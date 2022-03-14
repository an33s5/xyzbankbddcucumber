Feature: Login

  Customer should be able to login with valid account

  @customerlogin
  Scenario: Customer logs in to the system
    Given customer is on home page
    And clicks customer login button
    And select the name from drop down and click login
    Then verify user has logged in