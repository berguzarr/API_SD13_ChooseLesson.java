@Sevda1408
Feature: Teacher Olusturma

  Scenario:TC07_Date_Of_Birth_Editlenmeli

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Edit butonuna tiklar
    And Edit Choose Lesson menusune tiklar
    And Edit Choose Lessons dropdownundan ders secilir
    And Date Of Birth bolumune yeni bir tarih girer
    And Edit IsAdvisor secenegini isaretler
    And Edit Gender bölümünden Female seçeneğini seçilir
    And Edit Password kutusuna "09876543" girer
    And Edit bolumunde yer alan Submit butonuna tiklar
    Then Edit  işleminin gerçeklestigi doğrulanir