package model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static pages.TestContext.getDriver;

public class AdvertismentItem {

    private WebElement element;
    private String id;
    private WebElement checkbox;

    public AdvertismentItem(WebElement element) {
        this.element = element;
        this.id = element.getAttribute("id");
        this.checkbox = element.findElement(By.cssSelector("[type='checkbox']"));
    }

    public void selectCheckbox() {
        new Actions(getDriver())
                .moveToElement(element)
                .click(checkbox)
                .build()
                .perform();
    }

    public String getId(){
        return id;
    }


}
