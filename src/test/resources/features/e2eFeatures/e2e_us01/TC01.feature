@E2E @US01
Feature:TC01 | Aday ögrenciler sisteme kayıt olabilmeli

  @UI
  Scenario: WEB_sitesinde_tum_bilgiler_girilerek_basarili_bir_sekilde_kayit_yapilir
    Given Kullanici register a tiklar
    When Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden bir cinsiyet secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna bir "kullanici adi" girer
    And Password kutusuna "bir sifre" girer
    And Kullanici register butonuna tiklar
    Then Guest User Registeted Pop-Up mesajinin gorunur oldugu dogrulanir

  @API
  Scenario:API_testi_ile_web_sitesinde_yapilan_kaydin_basarili_oldugu_dogrulanir
    Given Kayitli ogrecinin userid bilgisi alinir_Api
    Then Ogrenci bilgileri dogrulanir_z

  @DB
  Scenario: DATABASE_testi_ile_web_sitesinde_yapilan_kaydin_basarili_oldugu_dogrulanir
    Given Kayitli ogrencinin UserId bilgileri ile sorgu yapilir
    Then Ogrenci kaydinin database dogrulamasi yapilir







