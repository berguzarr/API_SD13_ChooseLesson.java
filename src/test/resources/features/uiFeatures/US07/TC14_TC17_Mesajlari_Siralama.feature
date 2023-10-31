@US07
Feature: US07 Mesajlari Siralama

  #Background: Login olunur.
   # Given Dean, kullanici adi "Dean.Hababam" ve password "1234Ss+*" ile login olur

  Scenario: TC14_Mesajlari_siralama_name
    Given Kullanici login e tiklar
    When Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Name headerinda siralama butonu gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek


  Scenario: TC15_Mesajlari_siralama_email
    Given Kullanici login e tiklar
    When Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Email headerinda siralama butonu gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek

  Scenario: TC16_Mesajlari_siralama_date
    Given Kullanici login e tiklar
    When Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Date headerinda siralama butonu gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek

  Scenario: TC17_Mesajlari_siralama_subject
    Given Kullanici login e tiklar
    When Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then Subject headerinda siralama butonu gorundugunu dogrular
  # Edit: Buton eklenince düzeltilecek