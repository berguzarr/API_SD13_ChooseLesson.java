@Gurkay1340
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC40_Gender_bolumundeki_Female_secenegi_secilebilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Gender bolumunden "Female" secenegini secer
    Then Gender bolumundeki "Female" kutusunun secili oldugunu dogrular
