@US16
Feature: US16 Mesajlarda Search

  #Background: Login olunur.
   # Given Dean, kullanici adi "Dean.Hababam" ve password "1234Ss+*" ile login olur

  Scenario: TC18_Mesajlarda_search
    Given Kullanici login e tiklar
    When Username kutusuna "V.Dean.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Search butonu gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek



