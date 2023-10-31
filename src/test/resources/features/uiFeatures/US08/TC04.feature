@Esra
Feature: Vice Dean ders olusturabilmelidir
  Scenario:TC04_Lesson_Name_noktalama_isaretleri_girilmemeli
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    And Lesson Name alanina ",;;," girer
    And Credit Score alanina "ders kredisini" yazar
    And Lessons sayfasindaki Submit butonuna tiklar
    Then Dersin eklenmedigini dogrular