@Sevda3

Feature: Lesson Program

  Scenario: TC03_Choose_Lessons_Alani_Bos_birakilir

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    And "Add Lesson Program" headerinin gorunurlugu dogrular
    And Choose Day menusunden day secilir
    And Education Term menusunden Term secilir
    And Start Time menusunden "time degeri" belirtilir
    And Stop Time menusunden "time degeri" belirtilir
    And Submit butonuna tiklanir
    Then "Choose Lesson Hatasi" pup up mesaji goruntulenir