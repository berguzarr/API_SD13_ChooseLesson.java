@Sevda14
Feature: Lesson Program Assigment

  Scenario:TC014_Teacher_birden _fazla_dersi_ayni_gun_ve_ayni_saate_atanmamali

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Lesson Program sechilir
    Then "Lesson Program Assigment" headerinin gorunurlugu dogrular
    And Choose Teacher menusunden bir teacher secer
    And Lesson Program Assignment tablosundan "ayni gun ve saatteki iki" ders secilir
    And Choose Teacher bolumundeki Submit butonuna tiklanir
    Then "Ayni gun ve saat hata" pup up mesaji goruntulenir

