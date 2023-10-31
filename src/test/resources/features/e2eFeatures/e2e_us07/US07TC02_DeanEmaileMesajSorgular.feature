#@e2etest @US16
Feature: US07 Dean Mesajlari Email ile Sorgular

  @UI
  Scenario: US07TC01_UI_Dean_Tum_Mesajlari_goruntuleyebilmeli
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
    #And Mesajlarin name lerinin gorundugunu dogrular
    And Email header in gorundugunu dogrular
    #And Mesajlarin email lerinin gorundugunu dogrular
    And Date header in gorundugunu dogrular
    #And Mesajlarin date lerinin gorundugunu dogrular
    And Subject header in gorundugunu dogrular
    #And Mesajlarin subject lerinin gorundugunu dogrular
    And Driveri kapatir

  @API
  Scenario: US07TC02_API_Dean_Mesajlari_Email_ile_cagirir
    Given Kayitli contact mesajlari Email ile cagirir_API
    And Contact mesajlar icinde son gonderilenin Email i alinir_API
    And Contact Mesaj bilgileri dogrulanir_API

  @DB
  Scenario: US07TC02_DB_Dean_Mesajlari_Email_ile_cagirir
    Given Kayitli contact mesajlari Email ile cagirir_DB
    And Kayitli mesajin geldigini dogrular_DB

