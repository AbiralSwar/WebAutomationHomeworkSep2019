package MacysSearch;

import base.CommonAPI;


public class MacysSearchPage extends CommonAPI {

    public void searchMenu() {
        typeOnElementEntry("//*[@id=\"globalSearchInputField\"]", "Dress");
        navigateBack();
        typeOnElementEntry("//*[@id=\"globalSearchInputField\"]", "Handbags");
        navigateBack();
        typeOnElementEntry("//*[@id=\"globalSearchInputField\"]", "Pants");
        navigateBack();
        typeOnElementEntry("//*[@id=\"globalSearchInputField\"]", "makeup");
        navigateBack();
        typeOnElementEntry("//*[@id=\"globalSearchInputField\"]", "Shirt");
        navigateBack();
    }
}