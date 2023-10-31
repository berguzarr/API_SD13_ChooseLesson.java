@Sevda7

Feature: Lesson Program

  Scenario:TC07_Start_Time_menusunden_time_degerini_bos_birakir

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
    And Stop Time menusunden "time degeri" belirtilir
    And Submit butonuna tiklanir
    Then "Required" pup up mesaji goruntulenir
