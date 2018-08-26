@sslv
Feature: Filtering advertisments by category, save them to bookmarks and check that right advertisments was saved to bookmarks

  Scenario: Filtering and bookmarks saving
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
    And user chooses 3 random advertisments
    And user saves advertisments to bookmarks
    And user open bookmarks
    Then previously saved items are shown in bookmarks
