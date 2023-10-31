@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC23
  Scenario:TC23_DateOfBirth_Alanina_Invalid(ileritarih)_Deger_Girilmesi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Name kutusuna "isim" girilir
    And Surname kutusuna "soyisim" girilir
    And Birth Place kutusuna "dogum yeri" girilir
    And Username kutusuna "kullanici adi" girilir
    And Password kutusuna "sifre" girilir
    And Phone kutusuna "tel no" girilir
    And SSN kutusuna "kimlik no" girilir
    And Gender seçilir
    And Date Of Birth kutusuna "01012024" girilir
    And Submit butonuna tiklanir
    Then Kayit isleminin gerceklesmedigi dogrulanir
