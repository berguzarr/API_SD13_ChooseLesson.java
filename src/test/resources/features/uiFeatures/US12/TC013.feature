@Sevda13

Feature: Lesson Program Assigment

  Scenario:TC013_Teacher_birden_fazla_ders_atama

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    Then "Lesson Program Assigment" headerinin gorunurlugu dogrular
    And Choose Teacher menusunden bir teacher secer
    And Lesson Program Assignment tablosundan "iki" ders secilir
    And Choose Teacher bolumundeki Submit butonuna tiklanir
    Then "Lesson edit to teacher" pup up mesaji goruntulenir
