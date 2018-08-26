package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.TestContext;

import static pages.TestContext.getDriver;

public class Hooks {

    @Before
    public void startTestContext() {
        new TestContext();
    }

    @After
    public void closeDriver(){
        getDriver().quit();
    }
}
