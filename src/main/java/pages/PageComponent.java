package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import static pages.TestContext.getDriver;

class PageComponent {

    private final long ELEMENT_WAIT_TIMEOUT = 15;

    protected void openPage(String url) {
        getDriver().get(url);
    }

    protected void click(By locator) {
        getWait()
                .until(elementToBeClickable(locator))
                .click();
    }

    protected void doubleClick(By locator) {
        new Actions(getDriver()).doubleClick(getElement(locator)).perform();
    }

    protected void click(WebElement element) {
        element.click();
    }

    protected String getText(By locator) {
        return getWait()
                .until(presenceOfElementLocated(locator))
                .getText();
    }

    protected void setText(By locator, String text) {
        getWait()
                .until(presenceOfElementLocated(locator))
                .sendKeys(text);
    }

    protected void selectDropdownOption(By locator, String option) {
        new Select(getDriver().findElement(locator)).selectByVisibleText(option);
    }

    protected List<WebElement> getElements(By locator) {
        return getDriver().findElements(locator);
    }
    protected WebElement getElement(By locator) {
        return getDriver().findElement(locator);
    }

    protected void waitForElementDisappear(By locator) {
        getWait().until(elementHasDisappeared(getElement(locator)));
    }

    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), ELEMENT_WAIT_TIMEOUT);
    }

    private static ExpectedCondition<Boolean> elementHasDisappeared(WebElement element) {
        return input -> {
            try {
                return element.isDisplayed();
            }catch(NoSuchElementException | StaleElementReferenceException e) {
                return false;
            }
        };
    }


}
