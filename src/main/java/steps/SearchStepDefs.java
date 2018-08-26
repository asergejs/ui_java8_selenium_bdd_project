package steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Then;
import pages.SearchPage;

public class SearchStepDefs {

    @Inject
    SearchPage searchPage;

    @Then("user types (.*) as a search keyword$")
    public void setKeyword(String keyword){
      searchPage.enterSearchKeyword(keyword);
    }

    @Then("user selects (.*) as a search type$")
    public void setSearchType(String searchType){
      searchPage.enterSearchType(searchType);
    }

    @Then("user selects (.*) as a sort type$")
    public void setSortType(String sortType){
      searchPage.enterSortType(sortType);
    }

    @Then("user submits search$")
    public void submitSearch(){
      searchPage.submitSearch();
    }

    @Then("user sets search price range from (\\d+) to (\\d+)$")
    public void setSearchPriceRange(int from, int to){
      searchPage.setPriceRange(from, to);
    }


}
