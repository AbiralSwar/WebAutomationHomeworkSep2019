package Search;

import base.CommonAPI;

public class SearchPage extends CommonAPI {

    public void searchMenu(){
        typeOnElementEntry("#gh-ac", "mobile");
        navigateBack();
        typeOnElementEntry("#gh-ac", "tv");
        navigateBack();
        typeOnElementEntry("#gh-ac", "clothes");
        navigateBack();
//        typeOnElementEntry("#gh-ac", "watches");
//        navigateBack();
//        typeOnElementEntry("#gh-ac", "mobile");
//        navigateBack();
    }
}
