Feature: Login

  Customer should be able to logout

  @customerlogout
  Scenario: Customer logs out of the system
    Given customer is on home page
    And clicks customer login button
    And select the name from drop down and click login
    And click logout btn at the top right
    Then verify customer logged out