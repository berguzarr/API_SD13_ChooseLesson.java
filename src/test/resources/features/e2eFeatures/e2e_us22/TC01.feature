@E2E @US22
Feature:TC01 | Admin_Ekleme

  @UI
  Scenario:TC01_Gecerli_Admin_Ekleme
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
    And Date Of Birth kutusuna "dogum tarihi" girilir
    And Submit butonuna tiklanir
    Then Admin Saved pop-up mesajinin gorunur oldugu dogrulanmalidir

  @API
  Scenario: Admin_kaydi_dogrulamasi
    Given Kayit olan admin userid si alinir
    Then Admin kaydinin yapildigi dogrulanir

  @DB
  Scenario: Admin_DB_dogrulamasi
    Given Kayitli admin sorgulamasi yapilir
    Then Kayitli admin DB dogrulamasi yapilir

  Scenario: Admin_kaydi_silinir
    Given Kayitli admin silinir
    Then Admin kaydinin silindigi dogrulanir
