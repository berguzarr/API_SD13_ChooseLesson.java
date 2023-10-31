@HuseyinReport2
@huseyin2001
Feature: Teacher, toplantıları görebilmeli, güncelleyebilmeli ve silebilmelidir.
  Scenario: TC01_Toplantilarin_Date_Start_Time_Stop_Time_ve_Description_gorulmeli
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    Then Meet List bolumunde Date basliginin goruldugunu dogrular
    Then Meet List bolumunde Start Time basliginin goruldugunu dogrular
    Then Meet List bolumunde Stop Time basliginin goruldugunu dogrular
    Then Meet List bolumunde Description basliginin goruldugunu dogrular