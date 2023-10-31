@Gurkay1337
Feature: Vice Dean Ogretmen olusturabilmeli
  Scenario:TC37_Is_Adviser_Teacher_kutusu_secilebilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Is Advisor Teacher kutusuna tiklar
    Then Is Advisor Teacher kutusunun secili oldugunu dogrular
