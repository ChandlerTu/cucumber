Feature: Withdrawal

  Scenario: Successful withdrawal from an account in credit
    Given I have $100 in my account # the context
    When I request $20 # the event(s)
    Then $20 should be dispensed # the outcome(s)

  Scenario: Attempt withdrawal using stolen card
    Given I have $100 in my account
    But my card is invalid
    When I request $50
    Then my card should not be returned
    And I should be told to contact the bank
