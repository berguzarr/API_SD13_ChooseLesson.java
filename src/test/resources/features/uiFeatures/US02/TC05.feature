@US02_Nurullah
Feature:Guest User List

  @US02_TC05
  Scenario:TC05_Guest_User_Bilgilerini_Silme
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Guest User linkine tiklanir
    And Ilk satirdaki delete tusuna basilir
    Then Guest User deleted succesful Pop-up yazisinin gorunur oldugu dogrulanir