@HuseyinReport
@huseyin1908
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
    Then Choose Student bolumunun doldurulmadigina dair hata mesaji alindigini dogrular