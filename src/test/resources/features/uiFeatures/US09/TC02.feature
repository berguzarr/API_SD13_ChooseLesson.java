@Esra
Feature: Vice Dean ders listesini görebilmeli ve güncellemeler yapabilmelidir.
  Scenario:TC02_Lesson_List_alanındaki_Compulsory_görülmeli
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    Then "Compulsory" goruldugu dogrulanir