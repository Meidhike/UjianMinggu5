Feature: Booking Appointment at CURA Healthcare

  Scenario: Successful login and appointment booking
    Given User di halaman login
    When User enters username "John Doe" dan password "ThisIsNotAPassword"
    And User click login
    Then User di halaman appointment
    When User selects facility "Seoul CURA Healthcare Center"
    And User pilih date "15/08/2025"
    And User clicks book appointment button
    Then Display appointment confirmation
