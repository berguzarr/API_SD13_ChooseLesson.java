@US07
Feature: US07 Dean Mesaj Goruntuleme

  Background: Login olunur.
    Given Kullanici gecerli bir Contact Message olusturur
    Then Contact mesajin basariyla kaydedildigi dogrulanir
    When Kullanici login e tiklar
    And Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar

  Scenario: TC01_Mesajlarin_yazarlarini_goruntuleme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Contact message sayfasinda oldugunu dogrular
    And Name header in gorundugunu dogrular
    And Mesajlarin name lerinin gorundugunu dogrular

  Scenario: TC02_Mesajlarin_email_lerini_goruntuleme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Contact message sayfasinda oldugunu dogrular
    And Email header in gorundugunu dogrular
    And Mesajlarin email lerinin gorundugunu dogrular

  Scenario: TC03_Mesajlarin_date_lerini_goruntuleme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Contact message sayfasinda oldugunu dogrular
    And Date header in gorundugunu dogrular
    And Mesajlarin date lerinin gorundugunu dogrular

  Scenario: TC04_Mesajlarin_subject_lerini_goruntuleme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Contact message sayfasinda oldugunu dogrular
    And Subject header in gorundugunu dogrular
    And Mesajlarin subject lerinin gorundugunu dogrular

  @smoketest
  Scenario: TC05_Mesajlari_goruntuleme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Contact message sayfasinda oldugunu dogrular
    And Name header in gorundugunu dogrular
    And Mesajlarin name lerinin gorundugunu dogrular
    And Email header in gorundugunu dogrular
    And Mesajlarin email lerinin gorundugunu dogrular
    And Date header in gorundugunu dogrular
    And Mesajlarin date lerinin gorundugunu dogrular
    And Subject header in gorundugunu dogrular
    And Mesajlarin subject lerinin gorundugunu dogrular
    And Driveri kapatir

    # 2 ve sonrasi sayfalarda iken birinci sayfaya gelinebildigini dogrular