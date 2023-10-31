@US07
Feature: US07 Navigasyon butonlari gorunmemeli

  #Background: Login olunur.
   # Given Dean, kullanici adi "Dean.Hababam" ve password "1234Ss+*" ile login olur

  Scenario: TC10_Mesaj_Page_First_page_butonlari
    Given Kullanici login e tiklar
    When Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then First page de oldugunu dogrular
    And Onceki page butonunun goruntulenmedigini dogrular
  # Edit: Buton kaldırılınca düzeltilecek


  Scenario: TC11_Mesaj_Page_First_page_butonlari
    Given Kullanici login e tiklar
    When Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    Then First page de oldugunu dogrular
    And  First page butonunun goruntulenmedigini dogrular
  # Edit: Buton kaldırılınca düzeltilecek

  Scenario: TC12_Mesaj_Page_Last_page_butonlari
    Given Kullanici login e tiklar
    When Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    And Last page butonuna tiklar
    Then Next page butonunun goruntulenmedigini dogrular
  # Edit: Buton kaldırılınca düzeltilecek

  Scenario: TC13_Mesaj_Page_Last_page_butonlari
    Given Kullanici login e tiklar
    When Username kutusuna "D.Hababam" girer
    And Password kutusuna "1234Ss+*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Contact get all butonuna tiklar
    And Last page butonuna tiklar
    Then Last page butonunun goruntulenmedigini dogrular
  # Edit: Buton kaldırılınca düzeltilecek