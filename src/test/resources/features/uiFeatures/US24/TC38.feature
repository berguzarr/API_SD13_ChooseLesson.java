@Gurkay1338
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC38_Is_Adviser_Teacher_kutusu_secildikten_sonra_secim_kaldirilabilmeli
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Is Advisor Teacher kutusuna tiklar
    And Is Advisor Teacher kutusuna tiklar
    Then Is Advisor Teacher kutusunun secili olmadigini dogrular
