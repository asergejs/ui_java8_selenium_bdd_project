package pages;

import model.AdvertismentItem;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class BookmarksPage extends PageCommons {

    private final By SAVED_BOOKMARKS = By.cssSelector("[id*='tr']:not([id*='bnr'])");

    public List<AdvertismentItem> getBookmarkAdvertismentItems() {
        return getElements(SAVED_BOOKMARKS).stream()
                .map(AdvertismentItem::new)
                .collect(Collectors.toList());
    }

}
