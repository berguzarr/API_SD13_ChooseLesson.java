@HuseyinReport
@huseyin1903
Feature: Teacher meet olusturabilmeli
  Scenario: TC03_Date_Of_Meet secilebilmeli
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Date Of Meet bolumune tarih girer
    Then Date Of Meet bolumune tarih girilebildigini dogrular