@Esra
Feature: Vice Dean ders olusturabilmelidir
  Scenario:TC07_Lesson_Name_ayni_ders_iki_kere_eklenmemeli
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    And Lesson Name alanina "ders adi" girer
    And Credit Score alanina "ders kredisini" yazar
    And Lessons sayfasindaki Submit butonuna tiklar
    And Dersin eklendigini dogrular
    And Lesson Name alanina "ders adi" girer
    And Credit Score alanina "ders kredisini" yazar
    And Lessons sayfasindaki Submit butonuna tiklar
    Then Dersin eklenmedigini dogrular




