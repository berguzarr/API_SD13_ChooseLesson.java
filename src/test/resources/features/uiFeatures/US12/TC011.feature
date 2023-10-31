@Sevda11
Feature: Lesson Program Assigment

  Scenario:TC011_Choose_Lesson_sutununu_bos_birakir

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    Then "Lesson Program Assigment" headerinin gorunurlugu dogrular
    And Choose Teacher menusunden bir teacher secer
    And Choose Teacher bolumundeki Submit butonuna tiklanir
    Then "Lesson Added to Teacher Hata" pup up mesaji goruntulenir
