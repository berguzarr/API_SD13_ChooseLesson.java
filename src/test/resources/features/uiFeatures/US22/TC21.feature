@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC21
  Scenario:TC21_Iki_Cinsiyetin_Ayni_Anda_Secilememesi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Female butonuna tiklanir
    And Male butonuna tiklanir
    Then Female butonunun secili olmadigi dogrulanir

