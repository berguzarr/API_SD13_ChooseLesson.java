@US16
Feature: US16 Mesajlari Forward Etme

  #Background: Login olunur.
   # Given Dean, kullanici adi "Dean.Hababam" ve password "1234Ss+*" ile login olur

  Scenario: TC23_Mesajlarda_forward
    Given Kullanici login e tiklar
    When Username kutusuna "V.Dean.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Forward butonu gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek