package JCPSearch;

import base.CommonAPI;

public class JCPSearchPage extends CommonAPI {

    public void searchMenu() {

        typeOnElementEntry("#searchInputId", "Dress");
        navigateBack();


    }


    }

//        typeOnElementEntry("//*[@id=\"globalSearchInputField\"]", "Handbags");
//        navigateBack();
//        typeOnElementEntry("//*[@id=\"globalSearchInputField\"]", "Pants");
//        navigateBack();
//        typeOnElementEntry("//*[@id=\"globalSearchInputField\"]", "makeup");
//        navigateBack();
//        typeOnElementEntry("//*[@id=\"globalSearchInputField\"]", "Shirt");
//        navigateBack();
