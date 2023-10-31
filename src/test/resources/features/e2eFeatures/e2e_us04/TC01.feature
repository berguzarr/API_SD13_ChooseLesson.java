@E2E @US04
Feature: Admin Dean olusturabilmeli
  @UI
  Scenario:TC01_Tum_bilgiler_eksiksiz_girildiginde_basarili_kayit_yapilir
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Dean Management butonuna tiklar
    And DeanName kutusuna "bir isim" girer
    And DeanSurName kutusuna "bir soyisim" girer
    And DeanBirthPlace kutusuna "bir yer ismi" girer
    And DeanGender "FEMALE" secenegini girer
    And DeanDateOfBirth kutusuna tarih girer
    And DeanPhone kutusuna "bir telefon numarasi" girer
    And DeanSSN kutusuna SSNno girer
    And DeanUserName kutusuna "bir kullanici adi" girer
    And DeanPassword kutusuna sifre girer
    And DeanSubmit butonuna tiklar
    Then Dean kaydi yapildigi dogrulanir

    @API
  Scenario: US04TC01_API_Kayit_sirasinda_gonderilen_veriler_dogrulanir
    Given Kayitli deanin userId bilgisi alinir_API
    And Kayitli dean userId ile cagrilir
    Then Dean bilgileri dogrulanir
  #  And Kayitli dean silinir

    @DB
  Scenario: TC01_Kayit-sirasinda_gonderilen_verilerin_Database_dogrulamasi_yapilir
    Given Kayitli deanin userId bilgisi ile sorgu yapilir
    Then Dean bilgilerinin database dogrulamasi yapilir
