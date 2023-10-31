@Esra
Feature: Vice Dean ders olusturabilmelidir
  Scenario:TC02_Lessons_tum_alanlar_bos_bırakilmali
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    And Lessons sayfasindaki Submit butonuna tiklar
    Then Dersin zorunlu alan olduguna dair required mesajini dogrular
