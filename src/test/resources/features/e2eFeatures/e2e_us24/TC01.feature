@E2E @US24
Feature: US24 - TC01 | Admin hesabi ile basarili bir sekilde ogretmen kaydi olusturulabilmeli

  @UI
  Scenario: WEB_sitesinde_tum_bilgiler_girilerek_basarili_bir_sekilde_kayit_yapilir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Choose Lesson menusune tiklar
    And Choose Lesson menusunden bir ders secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Email kutusuna "bir eposta adresi" girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden "FEMALE" secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna tiklar
    Then Kayit isleminin gerceklestigini dogrular

  @API
  Scenario: API_testi_ile_web_sitesinde_yapilan_kaydin_basarili_oldugu_dogrulanir
    Given "Vice Dean" yetkisi ile giris yapilir
    And Kayitli ogretmenin userId bilgisi alinir
    And Kayitli ogretmen userId ile cagrilir
    Then Ogretmen bilgileri dogrulanir

  @DB
  Scenario: DATABASE_testi_ile_web_sitesinde_yapilan_kaydin_basarili_oldugu_dogrulanir
    Given Kayitli ogretmenin UserId bilgisi ile sorgu yapilir
    Then Ogretmen bilgilerinin database dogrulamasi yapilir

  @API
  Scenario: Ogretmen_kaydi_silinir
    Given Kayitli ogretmen userId ile cagrilir
    And Kayitli ogretmen silinir
    Then Ogretmen kaydinin silindigi dogrulanir