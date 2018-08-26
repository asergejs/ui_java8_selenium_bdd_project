package pages;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestContext {

    private static WebDriver driver;

    public TestContext() {
        driver = setUpDriver();
        setUpWaits();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    private void setUpWaits() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    private WebDriver setUpDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        ChromeDriverManager.getInstance().setup();
        return new ChromeDriver(chromeOptions);
    }

}
