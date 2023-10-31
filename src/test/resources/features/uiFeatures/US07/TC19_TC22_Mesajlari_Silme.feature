@US07
Feature: US07 Mesajlari Silme

  Background: Login olunur.
    Given Kullanici login e tiklar
    When Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar

  Scenario: TC19_Mesajlari_silme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Delete butonu gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek

  Scenario: TC20_Mesajlari_coklu_silme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    And Checkbox in gorundugunu dogrular
    And Checkbox a tiklayarak mesaj secer
    Then Delete butonu gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek

  Scenario: TC21_Mesajlari_tarihe_gore_silme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Date headerinda date input gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek

  Scenario: TC22_Mesajlari_coklu_silme
    When Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then All Delete butonu gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek
