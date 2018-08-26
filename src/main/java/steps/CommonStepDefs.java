package steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Then;
import pages.PageCommons;
import pages.SearchPage;

public class CommonStepDefs {

    @Inject
    PageCommons pageCommons;
    @Inject
    SearchPage searchPage;

    @Then("user changes language to Russian$")
    public void changeLanguageToRussian(){
        pageCommons.changeLanguageToRus();
    }

    @Then("user opens search$")
    public void openSearch(){
        pageCommons.openSearch();
        searchPage.expectPageElements();
    }

    @Then("user open bookmarks$")
    public void openBookmarks(){
        pageCommons.openBookmarks();
    }


}
