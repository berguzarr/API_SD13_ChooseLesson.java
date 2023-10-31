@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC08
  Scenario:TC08_Username_Alanının_Bos_Birakilmasi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Username kutusuna tiklanir
    And Submit butonuna tiklanir
    Then Username kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir
