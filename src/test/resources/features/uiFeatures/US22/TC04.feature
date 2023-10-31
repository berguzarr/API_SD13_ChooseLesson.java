@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC04
  Scenario:TC04_Surname_Alanının_Bos_Birakilmasi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Surname kutusuna tiklanir
    And Submit butonuna tiklanir
    Then Surname kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir
