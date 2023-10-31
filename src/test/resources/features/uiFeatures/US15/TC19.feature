@meryem
Feature: Vice Dean ogrenci olusturabilmeli
  Scenario: TC19_Name_SurName_Birthplace_Father&Mother_alanlarinda_SayisalDeger_Simge_Veya_Bosluk_icermemeli
    Given Kullanici login e tiklar
    When Username kutusuna "meryem25" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "12 ?34" girer
    And Surname kutusuna "#p0!L2" girer
    And Birth Place "10@  23?" girer
    And Email kutusuna "bir eposta adresi" girdi
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    And Ssn kutusuna bir numara girer
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "@1234?//" girer
    And Mother Name kutusuna "12*3 0" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then Kayit isleminin gerceklesmedigini dogrular
    #En son adim gerceklesmemesi gerekirken gerceklesmektedir,
    # Name_SurName_Birthplace_Father&Mother_alanlarinda_SayisalDeger_Simge_Veya_Bosluk_girilmistir ve
    # ona ragmen basarili bir sekilde ogrenci olusturulmustur, bunlarin hepsi birer Bug dur.!!!!!


