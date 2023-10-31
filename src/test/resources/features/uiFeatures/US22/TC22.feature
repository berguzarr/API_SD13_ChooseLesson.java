@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC18
  Scenario:TC22_DateOfBirth_Alanının_Bos_Birakilmasi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Date Of Birth kutusuna tiklanir
    And Submit butonuna tiklanir
    Then Date Of Birth kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir