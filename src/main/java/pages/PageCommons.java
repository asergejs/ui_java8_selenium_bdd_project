package pages;

import org.openqa.selenium.By;

public class PageCommons extends PageComponent {

    private final String RUS_HEADER_TITLE = "ОБЪЯВЛЕНИЯ";

    private final By LANGUAGE_BUTTON = By.cssSelector(".menu_lang");
    private final By PAGE_HEADER_TITLE = By.cssSelector(".page_header_head");
    private final By SEARCH = By.cssSelector("a[href*='/search/']");
    private final By BOOKMARKS = By.cssSelector("a[href*='/favorites/']");


    public void changeLanguageToRus() {
        changeLanguageTo(RUS_HEADER_TITLE, "Russian");
    }

    public void openSearch(){
        click(SEARCH);
    }

    public void openBookmarks(){
        click(BOOKMARKS);
    }

    private void changeLanguageTo(String expectedTitle, String expectedLanguage) {
        String titleOnStartup = getCurrentTitle();
        while (!getCurrentTitle().equals(expectedTitle)) {
            switchLanguage();
            if (getCurrentTitle().equals(titleOnStartup)) {
                throw new AssertionError(expectedLanguage + " language was not found");
            }
        }
    }

    private String getCurrentTitle() {
        return getText(PAGE_HEADER_TITLE);
    }

    private void switchLanguage() {
        click(LANGUAGE_BUTTON);
    }

}
