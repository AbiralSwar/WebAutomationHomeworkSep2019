package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    /**
     * Locator:
     * ID
     * Name
     * class Name
     * Link
     * LinkText
     * Tag Name
     * Css Selector
     * Xpath
     */

    @Test
    public void testSearch(){
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(" i phone");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.navigate().back();

    }


    public void testSignUp(){

    }

}