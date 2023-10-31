
@Sevda6
Feature: Lesson Program
  Scenario: TC06_Education_Term_menusu_bos_birakilir

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    And "Add Lesson Program" headerinin gorunurlugu dogrular
    And Choose Lesson menusune tiklar
    And Choose Lessons dropdownundan ders secilir
    And Choose Day menusunden day secilir
    And Start Time menusunden "time degeri" belirtilir
    And Stop Time menusunden "time degeri" belirtilir
    And Submit butonuna tiklanir
    Then "Please select education term" pup up mesaji goruntulenir
