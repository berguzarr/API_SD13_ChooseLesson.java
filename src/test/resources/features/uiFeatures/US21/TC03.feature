@Kozak2103
Feature: Ogrenci Choose Lesson listesinde
  Scenario: TC03_Teacher_Day_Starttime_Stoptime_bilgilerini_gorebilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "Arda" girer
    And Password kutusuna "Kral1907" girer
    And Login butonuna tiklar
    And Student ayni gun ve saatte iki ders secer
    And Student Choose Lesson submite tiklar
    Then Student ders eklendi yazisini gormedigini dogrular

