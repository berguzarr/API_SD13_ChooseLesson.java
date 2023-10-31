@Gurkay1341
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC41_Gender_bolumundeki_Male_secenegi_secilebilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Gender bolumunden "Male" secenegini secer
    Then Gender bolumundeki "Male" kutusunun secili oldugunu dogrular
