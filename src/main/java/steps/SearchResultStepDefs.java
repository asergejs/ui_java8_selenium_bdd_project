package steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Then;
import pages.SearchPage;
import pages.SearchResultPage;

public class SearchResultStepDefs {

    @Inject
    SearchResultPage searchResultPage;
    @Inject
    SearchPage searchPage;

    @Then("user opens advanced search$")
    public void openAdvancedSearch(){
      searchResultPage.openAdvancedSearch();
      searchPage.expectPageElements();
    }

    @Then("user chooses (\\d+) random advertisments$")
    public void chooseRandomAds(int adsCount){
      searchResultPage.chooseRandomAds(adsCount);
    }

    @Then("user saves advertisments to bookmarks$")
    public void saveAdsToBookmarks(){
        searchResultPage.addToBookmarks();
    }


}
