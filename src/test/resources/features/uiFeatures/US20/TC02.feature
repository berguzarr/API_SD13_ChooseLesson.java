@HuseyinReport2
@huseyin2002
Feature: Teacher, toplantıları görebilmeli, güncelleyebilmeli ve silebilmelidir.
  Scenario: TC02_Teacher_toplantilari_guncelleyebilmeli
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Meet List bolumundeki Edit butonuna tiklar
    And Choose Studentiki kutusuna "Huseyin Bulat" yazar
    And Date Of Meet bolumundeki tarihi ileri alir
    And Submitiki butonuna tiklar
    Then Toplantinin guncellendigini dogrular