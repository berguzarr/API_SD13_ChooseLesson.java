@e2etest

Feature: US11_The Vice Dean should be able to view and update the lesson program
  Scenario: TC01_The created entity should be able to display Lesson, Day, Start Time, and Stop Time.
    Given vice dean sends getAll request for lesson program
    Then vice dean gets the lesson program and assert
  Scenario: TC02_They should be able to update from the Lesson Program List.
    Given vice dean sends put request for lesson program
    Then vice dean update the lesson program and assert
  Scenario: TC03_Deletion should be possible from the Lesson Program List.
    Given vice dean sends delete request for lesson program
    Then vice dean delete the lesson program from id and assert