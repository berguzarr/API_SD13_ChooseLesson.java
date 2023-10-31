@E2E @US06
Feature: Dean Vice Dean hesabi olusturabilmeli
  @UI
  Scenario: TC01_Dean_Vice_Dean_olusturabilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "alexdesouza" girer
    And Password kutusuna "Kral1907" girer
    And Login butonuna tiklar
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "Turkey" girer
    And Gender bolumunden "Male" secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Phone kutusuna "bir telefon numarasi" girer_Koz
    And Ssn kutusuna bir numara girer_Koz
    And User Name kutusuna "bir kullanici adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna tiklar
    Then Kayit isleminin gerceklestigini dogrular
@API
  Scenario: TC01_Olusturulan_vicedean_API_testinde_gorunmeli
    Given User sets the url_Koz
    When User sets the expected data_Koz
    And User sends post request and gets the response_Koz
    Then User does assertion_Koz
  #  And Vice Dean silinir
@DB
  Scenario: TC01_Kaydedilen_vicedean_hesabinin_DataBase_dogrulamasi_yapilir
    Given Kayitli Vice Dean UserId bilgisi ile sorgu yapilir
    Then Vice Dean bilgilerinin database dogrulamasi yapilir