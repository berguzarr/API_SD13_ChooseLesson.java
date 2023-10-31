@Esra
Feature: Vice Dean ders olusturabilmelidir
  Scenario:TC10_Secili_olan_Compulsory_tik_isaretini_kaldirabilmeli
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Lesson Management butonuna tiklar
    And Lessons sekmesine tiklar
    And Compulsory kontrol kutusuna tiklar
    And Compulsory kutusunun secili oldugunu dogrular
    And Compulsory kontrol kutusuna tiklar
    Then Compulsory kutusunun secili olmadigini dogrula