package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;


public class BaseTest {
    public static WebDriver driver;

    @Before
    public void TestMaven() {
        System.setProperty("webdriver.chrome.driver", "C:/javademos/kitapyurduSelenium/src/test/resources/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        String baseUrl = "http://www.kitapyurdu.com";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.manage().window().maximize();

        String expectedTitle = "Kitapyurdu";
        if(driver.getTitle() != null && driver.getTitle().contains(expectedTitle)){
            System.out.println("Web page is opened");
        }
        else{
            System.out.println("Web page could not open.");
        }
    }


    @After
    public void tearDown(){
        driver.quit();
    }



}


