@HuseyinReport
@huseyin1901
Feature: Teacher meet olusturabilmeli
  Scenario: TC01_Choose_Student_bolumunden_ogrenci_secebilmelidir
    Given Kullanici login e tiklar
    When User Name kutusuna "Huseyin01" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Meet Management butonuna tiklar
    And Choose Student kutusuna tiklar
    And Acilan listede ilk secenege tiklar
    Then Ilk secenegin secildigini dogrular