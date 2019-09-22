package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @Parameters({"url"})

    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nepol\\IdeaProjects\\SeleniumProject1\\WebAutomationHomeworkSep2019\\Generic\\browser-driver\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver","C:\\Users\\nepol\\IdeaProjects\\SeleniumProject1\\WebAutomationHomeworkSep2019\\Generic\\browser-driver\\geckodriver.exe");

        driver=new ChromeDriver();
        //driver=new FirefoxDriverDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



        @AfterMethod
        public void cleanUp(){
            driver.close();
        }


}
