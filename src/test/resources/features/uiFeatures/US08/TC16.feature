@Esra
Feature: Vice Dean ders olusturabilmelidir
  Scenario:TC16_Credit_Score_sembol_karakteri_girilebilmeli
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    And Lesson Name alanina "ders adi" girer
    And Credit Score alanina "a" yazar
    And Lessons sayfasindaki Submit butonuna tiklar
    Then Dersin eklenmedigini dogrular