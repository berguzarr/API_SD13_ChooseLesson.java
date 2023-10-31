Feature: Teacher meet olusturabilmeli
  Scenario: TC04_Date_Of_Meet_alanina_gecmis_tarih_girilememelidir
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Choose Student kutusuna tiklar
    And Acilan listede ilk secenege tiklar
    And Date Of Meet bolumune gecmis tarih girer
    And Start Time bolumune saat girer
    And Stop Time bolumune saat girer
    And Description bolumune deger girer
    And Submitt butonuna tiklar

  Scenario: TC04_Date_Of_Meet_alanina_gecmis_tarih_girilememelidir_API
    Given User sets the url Hus
    When User sets the expected data Hus
    And User sends post request and gets the response Hus
    Then User does assertion Hus