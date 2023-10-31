@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC06
  Scenario:TC06_BirthPlace_Alanının_Bos_Birakilmasi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Birth Place kutusuna tiklanir
    And Submit butonuna tiklanir
    Then Birth Place kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir
