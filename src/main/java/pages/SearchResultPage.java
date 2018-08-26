package pages;

import model.AdvertismentItem;
import org.openqa.selenium.By;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static model.SavedItemsList.addToSavedItemsList;

public class SearchResultPage extends PageCommons {

    private final By ADVANCED_SEARCH = By.cssSelector("#page_main a[href*='/search/']");
    private final By SEARCH_RESULTS = By.cssSelector("[id*='tr']:not([id*='bnr'])");
    private final By ADD_BOOKMARKS_BTN = By.cssSelector("#a_fav_sel");

    public void openAdvancedSearch() {
        click(ADVANCED_SEARCH);
    }

    public void addToBookmarks(){
        click(ADD_BOOKMARKS_BTN);
    }

    public void chooseRandomAds(int adsCount) {
        List<AdvertismentItem> advertismentItems = getAdvertismentItems();
        Collections.shuffle(advertismentItems);

        List<AdvertismentItem> randomAdsList = advertismentItems.stream()
                .distinct()
                .limit(adsCount)
                .collect(Collectors.toList());

        addToSavedItemsList(randomAdsList);

        randomAdsList.stream()
                .forEach(AdvertismentItem::selectCheckbox);
    }

    private List<AdvertismentItem> getAdvertismentItems() {
        return getElements(SEARCH_RESULTS).stream()
                .map(AdvertismentItem::new)
                .collect(Collectors.toList());
    }

}
