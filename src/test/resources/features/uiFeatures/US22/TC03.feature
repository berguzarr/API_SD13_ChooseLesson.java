@US22_Nurullah
Feature:Admin_Ekleme

  @US22_TC03
  Scenario:TC03_Name_Alanina_Invalid(Space)_Deger_Girilmesi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Name kutusuna " " girilir
    And Surname kutusuna "soyisim" girilir
    And Birth Place kutusuna "dogum yeri" girilir
    And Username kutusuna "kullanici adi" girilir
    And Password kutusuna "sifre" girilir
    And Phone kutusuna "tel no" girilir
    And SSN kutusuna "kimlik no" girilir
    And Gender seçilir
    And Date Of Birth kutusuna "dogum tarihi" girilir
    And Submit butonuna tiklanir
    Then Kayit isleminin gerceklesmedigi dogrulanir
