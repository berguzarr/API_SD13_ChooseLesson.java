#@e2etest @US07
Feature: US07 Dean Mesajlari Goruntıeyebilmeli

  @UI
 Scenario: US07TC03_UI_Dean_Mesajlari_Subject_ile_cagirir
    Given Kullanici gecerli bir Contact Message olusturur
    Then Contact mesajin basariyla kaydedildigi dogrulanir
    When Kullanici login e tiklar
    And Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    And Gidilen sayfadaki mesajlarin goruntulendigini dogrular
    And Subject header in gorundugunu dogrular
    #And Mesajlarin subject lerinin gorundugunu dogrular
    And Driveri kapatir

  @API
  Scenario: US07TC03_API_Dean_Mesajlari_Subject_ile_cagirir
    Given Kayitli contact mesajlari Subject ile cagirir_API
    And Contact mesajlar icinde son gonderilenin Subject i alinir_API
    And Contact Mesaj bilgileri dogrulanir_Subject_ile_sorgu_API

  @DB
  Scenario: US07TC03_DB_Dean_Mesajlari_Subject_ile_cagirir
    Given Kayitli contact mesajlari Subject ile cagirir_DB
    And Kayitli mesajin geldigini dogrular_DB

