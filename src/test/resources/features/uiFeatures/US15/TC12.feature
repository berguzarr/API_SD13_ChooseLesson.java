@meryem
Feature: Vice Dean ogrenci olusturabilmeli

  Scenario: TC12_SSN_Numarasi_valid_bir_sekilde_girilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "meryem25" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    And Ogernci icin Choose Advisor Teacher secer
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girdi
    And Email kutusuna "Hayat@gmail.com" girdi
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    But SNN kutusuna 11 karakterden eksik karakter girer
    Then SSN bolumunun altinda "Minimum 11 character (XXX-XX-XXXX) " mesajini gorundugunu dogrular

    When Kullnici tekrar bastan baslar
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girdi
    And Email kutusuna "Hayat@gmail.com" girdi
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    But SNN kutusuna 11 karakter girer fakat tire isareti yerine bosluk birakir
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "bir baba adi" girer
    And Mother Name kutusuna "bir anne adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then "Please enter valid SNN number" mesajini gordugunu dogrular

    When Kullnici tekrar bastan baslar
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girdi
    And Email kutusuna "Hayat@gmail.com" girdi
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    But Kullanici 11 den fazla Karakter girrer
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "bir baba adi" girer
    And Mother Name kutusuna "bir anne adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then "Please enter valid SNN number" mesajini gordugunu dogrular

    When Kullnici tekrar bastan baslar
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girdi
    And Email kutusuna "Hayat@gamil.com" girdi
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    But Kullanici rakam yerine harf veya simge veya bosluk girer
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "bir baba adi" girer
    And Mother Name kutusuna "bir anne adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then "Please enter valid SNN number" mesajini gordugunu dogrular

    When Kullnici tekrar bastan baslar
    And Choose Advisor Teacher menusunden bir ogretmen secer
    And Name kutusuna "bir isim" girer
    And Surname kutusuna "bir soyisim" girer
    And Birth Place "bir yer ismi" girdi
    And Email kutusuna "bir eposta adresi" girdi
    And Phone kutusuna "bir telefon numarasi" girer
    And Gender bolumunden Femail secenegini secer
    And Date Of Birth bolumune bir tarih girer
    When Kullanici Snn Kutusuna valid deger girer, 3 ve 5 sayi arasina tire ekler
    And User Name kutusuna "bir kullanici adi" girer
    And Father Name kutusuna "bir baba adi" girer
    And Mother Name kutusuna "bir anne adi" girer
    And Password kutusuna bir sifre girer
    And Submit butonuna click eder
    Then kullanici "Student saved Successfully" basari mesajini dogrular

