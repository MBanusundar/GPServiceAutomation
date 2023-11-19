Feature: feature to test booking functionality

  Scenario: Check login is successful with valid credential
    Given user is in login page
    When fill the required fields
    And book an appointment
    Then verify Confirmation of successful booking submission
