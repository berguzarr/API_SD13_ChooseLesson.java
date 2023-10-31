@US07
Feature: US07 Mesajlari Forward Etme

  #Background: Login olunur.
   # Given Dean, kullanici adi "Dean.Hababam" ve password "1234Ss+*" ile login olur

  Scenario: TC18_Mesajlarda_search
    Given Kullanici login e tiklar
    When Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Forward butonu gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek



