@US02_Nurullah
Feature:Guest User List
  @US02_TC0
  Scenario:TC02_Phone_Number_Bilgisi_Dogrulama
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Guest User linkine tiklanir
    Then Ilk satirda kullanici oldugu dogrulanir