@US02_Nurullah
Feature:Guest User List

  @US02_TC03
  Scenario:TC03_SSN_Bilgisi_Dogrulama
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Guest User linkine tiklanir
    Then Ilk satirda kullanici oldugu dogrulanir