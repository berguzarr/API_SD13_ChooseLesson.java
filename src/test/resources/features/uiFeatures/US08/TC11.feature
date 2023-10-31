@Esra
Feature: Vice Dean ders olusturabilmelidir
  Scenario:TC11_Credit_Score_sayi_girilebilmeli
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
    Then Dersin eklendigini dogrular
