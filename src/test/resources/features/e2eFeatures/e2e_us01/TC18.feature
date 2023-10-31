@E2E @US01

  @UI
  Feature:Aday ögrenciler sisteme kayıt olabilmelidir
  Scenario: TC18_Kullanici_Register_olurken_Password_kutusu_invalid_deger_kabul_etmemeli
    Given Kullanici register a tiklar
    When Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden bir cinsiyet secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna bir "kullanici adi" girer
    And Password kutusuna "        "  karaekter girer
    And Kullanici register butonuna tiklar
    Then Kullanici register olamamali

    @API
    Scenario:API_testi_ile_web_sitesinde_yapilan_kaydin_basarili_oldugu_dogrulanir
      Given Kayitli ogrecinin userid bilgisi alinir_Api
      Then Ogrenci bilgileri dogrulanir_z
       Then Ogrenci Kaydin gerceklesmedigi dogrulanir

    @DB
    Scenario: DATABASE_testi_ile_web_sitesinde_yapilan_kaydin_basarili_oldugu_dogrulanir
      Given Kayitli ogrencinin UserId bilgileri ile sorgu yapilir
      Then Ogrenci kaydinin database dogrulamasi yapilir
      Then Ogrenci bilgilerinin database icinde olmadigi dogrulamasi yapilir
