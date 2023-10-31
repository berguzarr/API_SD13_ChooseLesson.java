@Esra
Feature: Vice Dean ders olusturabilmelidir
  Scenario:TC12_Credit_Score_bos_birakilmamali
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    And Lesson Name alanina "ders adi" girer
    And Lessons sayfasindaki Submit butonuna tiklar
    Then Credit Score alaninin zorunlu alan olduguna dair required mesajini dogrular



