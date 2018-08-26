package pages;

import org.openqa.selenium.By;

public class SearchPage extends PageCommons {

    private final By SEARCH_KEYWORD_TEXTFIELD = By.cssSelector("#ptxt");
    private final By SEARCH_TYPE = By.cssSelector("[name='sid']");
    private final By SORT_TYPE = By.cssSelector("[name='sort']");
    private final By SUBMIT_BTN = By.cssSelector("input[type='submit']");
    private final By HEAD_TITLE = By.cssSelector(".headtitle");
    private final By PRELOAD_TEXT = By.cssSelector("#preload_txt");
    private final By MIN_RANGE = By.cssSelector("[name*='min'");
    private final By MAX_RANGE = By.cssSelector("[name*='max'");

    public void expectPageElements(){
        getElement(HEAD_TITLE).isDisplayed();
    }

    public void enterSearchKeyword(String keyword){
        setText(SEARCH_KEYWORD_TEXTFIELD, keyword);
        clickOnHeadTitleToRemoveSearchDropdown();
    }

    public void enterSearchType(String searchType){
        selectDropdownOption(SEARCH_TYPE, searchType);
    }

    public void enterSortType(String sortType){
        selectDropdownOption(SORT_TYPE, sortType);
    }

    public void submitSearch(){
        click(SUBMIT_BTN);
    }

    public void setPriceRange(int from, int to){
        setText(MIN_RANGE, Integer.toString(from));
        setText(MAX_RANGE, Integer.toString(to));
    }

    private void clickOnHeadTitleToRemoveSearchDropdown(){
        doubleClick(HEAD_TITLE);
        waitForElementDisappear(PRELOAD_TEXT);
    }

}
