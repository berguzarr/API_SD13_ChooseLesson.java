@E2E  @US14

Feature: TC01 | Vice Dean Teacher List Bilgilerini Gorur

  @UI
  Scenario:TC01_Teacher_Olusturma

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Teacher List bolumunde daha once olusturulan kayitların Name Surname bilgisinin görülebildigi dogrulanir
    And Teacher List bolumunde daha once olusturulan kayitların Phone Number bilgisinin görülebildigi dogrulanir
    And Teacher List bolumunde daha once olusturulan kayitların Ssn bilgisinin görülebildigi dogrulanir
    And Teacher List bolumunde daha once olusturulan kayitların User Name Surname bilgisinin görülebildigi dogrulanir

  @API
  Scenario:API_testi_ile_web_sitesinde_Vice_Dean_Teacher_Listte_Name_PhoneNumber_SSN_UserName_bilgilerini_görebilmeli

    Given     Get request ile tum teacherlari al
    Then Body yi dogrula


  @DB

  Scenario: DATABASE_testi_ile_web_sitesinde_Vice_Dean_Teacher_Listte_Name_PhoneNumber_SSN_UserName_bilgileriniN_goruldugu_dogrulanir
    Given Kayitli ogretmenin UserId bilgisi ile sorgu yapilir
    Then Ogretmen bilgilerinin database dogrulamasi yapilir
