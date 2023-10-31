@HuseyinReport2
@huseyin2003
Feature: Teacher, toplantıları görebilmeli, güncelleyebilmeli ve silebilmelidir.
  Scenario: TC03_Teacher_toplantilari_silebilmelidir
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Delete butonuna tiklar
    Then toplantinin silindigini dogrular