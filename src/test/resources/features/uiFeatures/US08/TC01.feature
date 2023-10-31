@Esra
Feature: Vice Dean ders olusturabilmelidir
  Scenario:TC01_Lesson_Name_Compulsory_Credit_alanlari_eksiksiz_doldurulmali
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    And Lesson Name alanina "ders adi" girer
    And Compulsory kontrol kutusuna tiklar
    And Credit Score alanina "ders kredisini" yazar
    And Lessons sayfasindaki Submit butonuna tiklar
    Then Dersin eklendigini dogrular
