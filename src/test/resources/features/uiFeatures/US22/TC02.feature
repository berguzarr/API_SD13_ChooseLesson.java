@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC02
  Scenario:TC02_Name_Alanının_Bos_Birakilmasi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Name kutusuna tiklanir
    And Submit butonuna tiklanir
    Then Name kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir
