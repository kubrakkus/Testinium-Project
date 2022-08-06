package org.example.methods;

import org.example.driver.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Methods {

    WebDriver driver;

    public  Methods(){
        driver = BaseTest.driver;
       // driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);



    }
    public void waitBySeconds(long seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void click(By cssSelector){
        driver.findElement(cssSelector).click();
    }

}
