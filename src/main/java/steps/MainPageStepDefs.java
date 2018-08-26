package steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.MainPage;


public class MainPageStepDefs {

    @Inject
    private MainPage mainPage;

    @Given("^user opens main page$")
    public void openMainPage() {
        mainPage.openMainPage();
        mainPage.acceptCookies();
    }

    @Then("user chooses (.*) category$")
    public void changeCategoryTo(String category) {
        mainPage.chooseCategory(category);
    }

}
