package JCPSearch;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JCPLogin extends CommonAPI {



    public void typeOnElementNEnterCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public void getEelementsByCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void getSubmitByXpath(String locator){
        driver.findElement(By.xpath(locator)).submit();
    }
    public void getEelementsByxpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void getEelementsByID(String locator){
        driver.findElement(By.id(locator)).click();
    }

    public void clearField(String locator){
        driver.findElement(By.id(locator)).clear();
    }
    public void selectOnid1(String locator){
        Select select1 = new Select(driver.findElement(By.id(locator)));

    }
    public void putElementOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void selectElementOnxpath(String locator){
        WebElement select = driver.findElement(By.xpath(locator));select.click();
    }
    public void selectOnid2(String locator, String value) {
        Select select2 = new Select(driver.findElement(By.id(locator)));
        select2.selectByVisibleText(value);
    }
    public void selectOnname(String locator, String value) {
        Select select3 = new Select(driver.findElement(By.name(locator)));
        select3.selectByVisibleText(value);
    }

    public void navigateBack(){
        driver.navigate().back();
    }
}

