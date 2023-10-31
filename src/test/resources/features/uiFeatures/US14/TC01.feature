@Sevda1401
Feature: Teacher Olusturma

  Scenario:TC01_Teacher_Olusturma

    Given Kullanici login e tiklar
    When Username kutusuna "Conroy" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Teacher Management butonuna tiklar
    And Teacher List bolumunde daha once olusturulan kayitların Name Surname bilgisinin görülebildigi dogrulanir
    And Teacher List bolumunde daha once olusturulan kayitların Phone Number bilgisinin görülebildigi dogrulanir
    And Teacher List bolumunde daha once olusturulan kayitların Ssn bilgisinin görülebildigi dogrulanir
    And Teacher List bolumunde daha once olusturulan kayitların User Name Surname bilgisinin görülebildigi dogrulanir
