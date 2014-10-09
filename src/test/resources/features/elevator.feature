Feature: Elevator

  Scenario Outline: Calling the elevator when it's on the entrance floor
    Given The elevator is on the entrance floor
    When the elevator is called from the <call> floor
    Then the elevator is moved to the <destination> floor

  Examples: Floors
    | call | destination |
    | 1    | 1           |
    | 2    | 2           |