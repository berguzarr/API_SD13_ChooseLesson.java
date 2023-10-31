@Kozak2321
Feature: Admin Vice Dean hesabi olusturabilmeli
  Scenario: TC21_Username_kutusu_bos_birakilmasi
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Gender bolumunden "Male" secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Ssn kutusuna bir numara girer
    And Password kutusuna bir sifre girer
    And Submit butonuna tiklar
    Then Username bolumu altinda "Required" mesajini gorundugunu dogrularKoz