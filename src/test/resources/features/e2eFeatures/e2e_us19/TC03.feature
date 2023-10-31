Feature: Teacher meet olusturabilmeli
  Scenario: TC08_Choose_Student_bolumu_doldurulmadan_meet_olusturulamamalidir
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Date Of Meet bolumune tarih girer
    And Start Time bolumune saat girer
    And Stop Time bolumune saat girer
    And Description bolumune deger girer
    And Submit butonuna tiklar

  Scenario: TC08_Choose_Student_bolumu_doldurulmadan_meet_olusturulamamalidir_Api
    Given User sets the url Hus
    When User sets the expected data Hus
    And User sends post request and gets the response Hus
    Then User does assertioniki Hus