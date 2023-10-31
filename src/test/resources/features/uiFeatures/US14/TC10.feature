@Sevda1411
Feature: Teacher Olusturma

  Scenario:TC10_Gender_Editlenmeli

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Edit butonuna tiklar
    And Edit Choose Lesson menusune tiklar
    And Edit Choose Lessons dropdownundan ders secilir
    And Edit IsAdvisor secenegini isaretler
    And Edit Gender bölümünden Female seçeneğini seçilir
    And Edit Password kutusuna "09835656" girer
    And Edit bolumunde yer alan Submit butonuna tiklar
    Then Edit  işleminin gerçeklestigi doğrulanir