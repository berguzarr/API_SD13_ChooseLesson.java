@Esra
Feature: Vice Dean ders listesini görebilmeli ve güncellemeler yapabilmelidir.
  Scenario:TC05_Lesson_List_alanındaki_ders_bilgileri_guncellenmeli
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    Then Edit butonunun goruldugu dogrulanir