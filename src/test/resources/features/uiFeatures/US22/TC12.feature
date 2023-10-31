@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC12
  Scenario:TC12_Phone_Alanının_Bos_Birakilmasi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Phone kutusuna tiklanir
    And Submit butonuna tiklanir
    Then Phone kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir
