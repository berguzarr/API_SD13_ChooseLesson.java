@E2E @US23
Feature: Admin Vice Dean hesabi olusturabilmeli
  @UI
  Scenario: TC03_Name_kismina_sayi_girilmesi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Name kutusuna "1234" girer
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
  Scenario: TC03_Olusturulan_vicedean_API_testinde_gorunmeli
    Given User sets the url_Koz
    When User sets the expected data_Koz
    And User sends post request and gets the response_Koz
    Then User does assertion_Koz
    And Vice Dean silinir