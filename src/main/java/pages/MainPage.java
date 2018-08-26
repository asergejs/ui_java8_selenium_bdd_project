package pages;


import org.openqa.selenium.By;

public class MainPage extends PageCommons {

    private final String MAIN_PAGE_URL = "https://www.ss.com/";

    private final By HEADLINES = By.cssSelector(".main_head");
    private final By ACCEPT_COOKIES_BTN = By.cssSelector("#cookie_confirm_body button");

    public void openMainPage() {
        openPage(MAIN_PAGE_URL);
    }

    public void chooseCategory(String expectedCategory) {
        click(getElements(HEADLINES).stream()
                .filter(it -> it.getText().equals(expectedCategory))
                .findFirst()
                .orElseThrow(() -> new AssertionError(expectedCategory + " category was not found")));
    }

    public void acceptCookies() {
        click(ACCEPT_COOKIES_BTN);
    }

}
