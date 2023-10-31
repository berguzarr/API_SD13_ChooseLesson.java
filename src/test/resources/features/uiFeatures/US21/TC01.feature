@Kozak2101
Feature: Ogrenci Choose Lesson listesinde
  Scenario: TC01_Teacher_Day_Starttime_Stoptime_bilgilerini_gorebilmelidir
    Given Kullanici login e tiklar
    When Username kutusuna "Arda" girer
    And Password kutusuna "Kral1907" girer
    And Login butonuna tiklar
    Then Teacher,Day,StartTime,StopTime basliginin gorundugunu dogrular
