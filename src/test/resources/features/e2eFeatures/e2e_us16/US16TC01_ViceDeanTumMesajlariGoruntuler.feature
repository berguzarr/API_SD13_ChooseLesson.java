@E2E @US16
Feature: US16 | Dean Mesajlari Goruntuler

  @UI
  Scenario: US16TC01_UI_Dean_Tum_Mesajlari_goruntuleyebilmeli
    Given Kullanici gecerli bir Contact Message olusturur
    Then Contact mesajin basariyla kaydedildigi dogrulanir
    When Kullanici login e tiklar
    And Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Contact message sayfasinda oldugunu dogrular
    And Last page butonuna tiklar
    Then En Son sayfaya gidildigini dogrular
    When First page butonuna tiklar
    And First page de oldugunu dogrular
    And Gidilen sayfadaki mesajlarin goruntulendigini dogrular
    And Name header in gorundugunu dogrular
    And Email header in gorundugunu dogrular
    And Date header in gorundugunu dogrular
    And Subject header in gorundugunu dogrular
    And Mesajlarin name lerinin gorundugunu dogrular
    And Mesajlarin email lerinin gorundugunu dogrular
    And Mesajlarin date lerinin gorundugunu dogrular
    And Mesajlarin subject lerinin gorundugunu dogrular
    And Driveri kapatir

  @DB
  Scenario: US16TC01_DB_ViceDean_Tum_Mesajlari_goruntuler
    Given Dean kayitli tum contact mesajlari cagirir_DB
    And Dean kayitli tum mesajlarin geldigini dogrular_DB

  @API
  Scenario: US16TC01_API_ViceDean_Tum_Mesajlari_goruntuler
    Given Dean kayitli mesajlari cagirir_API
    And Dean Kayitli butun mesajlarin geldigini dogrular_API

  @API
  Scenario: US16TC02_API_ViceDean_Mesajlari_Email_ile_cagirir
    Given Kayitli contact mesajlari Email ile cagirir_API
    And Contact mesajlar icinde son gonderilenin Email i alinir_API
    And Contact Mesaj bilgileri dogrulanir_API

  @DB
  Scenario: US16TC02_DB_ViceDean_Mesajlari_Email_ile_cagirir
    Given Kayitli contact mesajlari Email ile cagirir_DB
    And Kayitli mesajin geldigini dogrular_DB

  @API
  Scenario: US16TC03_API_ViceDean_Mesajlari_Subject_ile_cagirir
    Given Kayitli contact mesajlari Subject ile cagirir_API
    And Contact mesajlar icinde son gonderilenin Subject i alinir_API
    And Contact Mesaj bilgileri dogrulanir_Subject_ile_sorgu_API

  @DB
  Scenario: US16TC03_DB_ViceDean_Mesajlari_Subject_ile_cagirir
    Given Kayitli contact mesajlari Subject ile cagirir_DB
    And Kayitli mesajin geldigini dogrular_DB