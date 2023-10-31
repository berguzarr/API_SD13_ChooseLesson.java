@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC11
  Scenario:TC11_Password_Alanına_Gecersiz_Deger_Girilmesi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Password kutusuna "1234567" girilir
    Then Password kutusunun altinda Required yazisinin gorunur oldugu dogrulanmalidir
