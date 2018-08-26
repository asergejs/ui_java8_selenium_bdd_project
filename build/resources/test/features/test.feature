@sslv
Feature: ss at

  Scenario: First test
    Given user opens main page
    Then user changes language to Russian
    Then user chooses Электротехника category
    And user opens search
    And user types Компьютер as a search keyword
    And user selects Продают as a search type
    And user selects Цена as a sort type
    Then user submits search
    And user opens advanced search
    And user sets search price range from 0 to 300
    Then user submits search
    Then yo
