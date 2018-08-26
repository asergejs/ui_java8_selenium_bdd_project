package model;

import java.util.ArrayList;
import java.util.List;

public class SavedItemsList {

    private static List<AdvertismentItem> savedList = new ArrayList<>();

    public static void addToSavedItemsList(List<AdvertismentItem> list){
        savedList.addAll(list);
    }

    public static List<AdvertismentItem> getSavedList(){
        return savedList;
    }
}
