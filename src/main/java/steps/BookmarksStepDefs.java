package steps;

import com.google.inject.Inject;
import cucumber.api.java.en.Then;
import model.AdvertismentItem;
import pages.BookmarksPage;

import java.util.List;
import java.util.stream.Collectors;

import static model.SavedItemsList.getSavedList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;


public class BookmarksStepDefs {

    @Inject
    BookmarksPage bookmarksPage;

    @Then("previously saved items are shown in bookmarks$")
    public void compareSavedItems() {
        List<String> bookmarkListIds = getListIds(bookmarksPage.getBookmarkAdvertismentItems());
        List<String> savedListIds = getListIds(getSavedList());

        assertThat("Bookmarked items doesnt match previously saved items",
                bookmarkListIds, containsInAnyOrder(savedListIds.toArray()));
    }

    private List<String> getListIds(List<AdvertismentItem> list) {
        return list.stream()
                .map(AdvertismentItem::getId)
                .collect(Collectors.toList());
    }

}
