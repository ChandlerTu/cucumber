Feature: Cash withdrawal

  Scenario: Successful withdrawal from an account in credit
    Given I have deposited $100 in my Account
    When I request $20
    Then $20 should be dispensed

  Scenario: New accounts get a $1 gift
    Given I have a brand new Account
    And I deposit $99
    Then the balance of my Account should be $100

  Scenario: Successful withdrawal from an account in credit
    Given I have deposited $250 in my Account
    When I request $20
    Then $20 should be dispensed
