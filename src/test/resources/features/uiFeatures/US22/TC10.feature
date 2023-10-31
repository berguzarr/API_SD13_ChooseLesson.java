@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC10
  Scenario:TC10_Password_Alanının_Bos_Birakilmasi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Password kutusuna tiklanir
    And Submit butonuna tiklanir
    Then Password kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir
