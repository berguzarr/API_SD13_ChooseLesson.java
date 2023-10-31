@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC19
  Scenario:TC19_SSN_Alanının_Bos_Birakilmasi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And SSN kutusuna tiklanir
    And Submit butonuna tiklanir
    Then SSN kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir