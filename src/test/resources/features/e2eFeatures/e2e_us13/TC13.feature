@E2E @US13
Feature: US13 - TC13 | Submit butonuna iki kez tıklandığında sadece bir kez kayıt yapılmalı

  @UI
  Scenario: WEB_sitesinde_submit_butonuna_iki_kez_tiklandiginda_bir_kez_kayit_yapilamamali
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayvd" girer
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
    And Submit butonuna tiklar
    Then Kayit isleminin sadece bir kez gerceklestigini dogrular

  @API
  Scenario: API_testi_ile_web_sitesinde_yapilan_kayit_dogrulanir
    Given "Vice Dean" yetkisi ile giris yapilir
    And Kayitli ogretmenin userId bilgisi alinir
    And Kayitli ogretmen userId ile cagrilir
    Then Ogretmen bilgileri dogrulanir
    Then Ayni ogretmen bilgilerine sahip baska bir kayit olmadigi dogrulanir

  @DB
  Scenario: DATABASE_testi_ile_web_sitesinde_yapilan_kayit_dogrulanir
    Given Kayitli ogretmenin UserId bilgisi ile sorgu yapilir
    Given Kayitli ikinci ogretmenin UserId bilgisi ile sorgu yapilir
    Then Iki ogretmenin bilgileri karsilastirilarak database dogrulamasi yapilir

  @API
  Scenario: Ogretmen_kaydi_silinir
    Given Kayitli ogretmen userId ile cagrilir
    And Kayitli iki ogretmen silinir
    Then Ogretmen kaydinin silindigi dogrulanir