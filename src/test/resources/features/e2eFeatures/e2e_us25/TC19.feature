@E2E @US25
Feature:TC19 | Admin ogrenci olusturabilmeli

  @UI
  Scenario: WEB_sitesinde_Name_SurName_Birthplace_Father&Mother_alanlarinda_SayisalDeger_Simge_Veya_Bosluk_girilmemeli
    Given Kullanici login e tiklar
    When Username kutusuna "meryem25" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "12 ?34" girer
    And Surname kutusuna "#p0!L2" girer
    And Birth Place "10@  23?" girer
    And Email kutusuna "bir eposta adresi" girdi
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden "FEMALE" secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "@1234?//" girdi
    And Mother Name kutusuna "12*3 0" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then Kayit isleminin gerceklesmedigini dogrularr

@API
  Scenario: API_testi_ile_web_sitesindeki_yapilmis_olan_kayittaki_hatali_veriler_uyusmakta
    Given  Kayitli Ogrencinin Id bilgisi alinir_API
    And Kayitli Ogrenci userId ile cagirilir
    Then Ogrenci bilgileri dogrulanir

@DB
  Scenario: DATABASE_testi_ile_web_sitesinde_yapilan_kayidin_gerceklesmemesi_gerekirken_DataBase_dogrulamasi_basarilidir
    Given Kayitli ogrencinin UserId bilgisi ile sorgu yapilir
    Then Ogrenci bilgilerinin database dogrulamasi yapilir

@API
  Scenario: Kayit_edilen_Ogrenci_silinir
    Given Kayitli Ogrenci userId ile cagirilir
    And Kayitli ogrenci silinir
    Then ogrencinin silindigi dogrulanir