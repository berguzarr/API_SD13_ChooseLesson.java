@Esra
Feature: Vice Dean ders listesini görebilmeli ve güncellemeler yapabilmelidir.
  Scenario:TC04_Lesson_List_alanında_olusturulan_ders_silinmeli
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
    And Dersin eklendigini dogrular
    And En son sayfaya gitme sekmesine tiklar
    And En son olusturulan dersi siler
    Then Olusturulan dersin silindigi dogrulanir

