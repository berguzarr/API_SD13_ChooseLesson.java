@Sevda5
Feature: Lesson Program
  Scenario:TC05_Starttime_stoptime_gecersiz_saat_belirtilir

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    And "Add Lesson Program" headerinin gorunurlugu dogrular
    And Choose Lesson menusune tiklar
    And Choose Lessons dropdownundan ders secilir
    And Choose Day menusunden day secilir
    And Education Term menusunden Term secilir
    And Start Time menusunden "0200" belirtilir
    And Stop Time menusunden "0400" belirtilir
    And Submit butonuna tiklanir
    Then "Created Lesson Program" pup up mesaji goruntulenir

