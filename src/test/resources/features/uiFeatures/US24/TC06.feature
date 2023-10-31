@Gurkay1306
Feature: Admin Ogretmen olusturabilmeli
  Scenario:TC06_Sayfadaki_tum_bilgi_kutulari_doldurulduktan_sonra_Choose_Lesson_menusunden_bir_ders_secildiginde_kayit_yapilabilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "gurkayadm" girer
    And Password kutusuna "22qw76AS*" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girer
    And Email kutusuna "bir eposta adresi" girer
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden "Male" secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Password kutusuna bir sifre girer
    And Choose Lesson menusune tiklar
    And Choose Lesson menusunden bir ders secer
    And Submit butonuna tiklar
    And Kayit isleminin gerceklestigini dogrular
