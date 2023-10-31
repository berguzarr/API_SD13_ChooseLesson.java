@Esra
Feature: Vice Dean ders olusturabilmelidir
  Scenario:TC09_Compulsory_tiklanabilir_olmali
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    And Compulsory kontrol kutusuna tiklar
    Then Compulsory kutusunun secili oldugunu dogrular