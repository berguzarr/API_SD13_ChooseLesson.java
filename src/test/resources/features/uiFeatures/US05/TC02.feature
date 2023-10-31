@UI
Feature: Admin Deanleri görebilmeli ve silebilmeli
  Scenario: TC02_Admin_Deanleri_Silebilmeli
    Given Kullanici login e tiklar
    When Username kutusuna "AdminB103" girer
    And Password kutusuna "12345678" girer
    And Login butonuna tiklar
    And Menu butonuna tiklar
    And Dean Management butonuna tiklar
    And Dean list gorundugu dogrulanir
    And Dean delete butonu gorunmedigi dogrulanir