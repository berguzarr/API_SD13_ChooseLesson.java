@meryem2
Feature:Admin ogrenci olusturabilmelidir
  Scenario: TC15_Student Number_otamatik_olarak_gelmeli

    Given Kullanici login e tiklar
    When Username kutusuna "meryem24" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Student Management Butonuna tiklar
    But Kullanici bulundugu sayfada otamatik olarak gelen Student Number goremez
    Then Student List te  Student Numberlar gorunur