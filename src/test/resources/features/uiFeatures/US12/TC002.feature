@Sevda2

Feature: Lesson Program ders olusturma
  Scenario:TC02_Program_List_Create

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lesson Program sechilir
    And "Add Lesson Program" headerinin gorunurlugu dogrular
    And Choose Lesson menusune tiklar
    And Choose Lessons dropdownundan ders secilir
    And Choose Day menusunden day secilir
    And Education Term menusunden Term secilir
    And Start Time menusunden "time degeri" belirtilir
    And Stop Time menusunden "time degeri" belirtilir
    And Submit butonuna tiklanir
    Then "Created Lesson Program" pup up mesaji goruntulenir

