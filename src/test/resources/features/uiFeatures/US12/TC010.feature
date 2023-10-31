@Sevda10

Feature: Lesson Program Assigment

  Scenario:TC10_Choose_Teacher_menusunden_teacher_secilir

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    Then "Lesson Program Assigment" headerinin gorunurlugu dogrular
    And Choose Teacher menusunden bir teacher secer
    And Lesson Program Assignment tablosundan "bir" ders secilir
    And Choose Teacher bolumundeki Submit butonuna tiklanir
    Then "Lesson Added to Teacher" pup up mesaji goruntulenir
