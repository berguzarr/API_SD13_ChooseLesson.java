@Kozak0611
Feature: Dean Vice Dean hesabi olusturabilmeli
  Scenario: TC11_Gender_bos_gecilmesi
    Given Kullanici login e tiklar
    When Username kutusuna "alexdesouza" girer
    And Password kutusuna "Kral1907" girer
    And Login butonuna tiklar
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Date Of Birth bolumune bir tarih girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna tiklar
    Then Kayit olmadigini telefonlarin farkli olmasi ile dogrular