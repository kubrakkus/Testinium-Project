package org.example.pages;

import org.example.methods.Methods;
import org.openqa.selenium.*;

import  static org.example.driver.BaseTest.driver;


public class HomePage {

    Methods methods;



    public  HomePage(){
        methods=new Methods();
    }

    public void searchBook(){

       driver.findElement(By.id("search-input")).sendKeys("roman");

        methods.waitBySeconds(1);

        driver.findElement(By.cssSelector(".common-sprite.button-search")).click();

        methods.waitBySeconds(1);
    }



}
