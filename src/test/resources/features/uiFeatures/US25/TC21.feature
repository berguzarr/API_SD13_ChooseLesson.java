@meryem2
Feature: Admin ogrenci olusturabilmelidir
  Scenario: TC21_Admin_olmayan_kimse_Ogrenci_olusturamaz
    Given Kullanici login e tiklar
    When Username kutusuna "gameTurner" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    Then Menu Buttonu altinda Student Management Bolumunu Goremez



