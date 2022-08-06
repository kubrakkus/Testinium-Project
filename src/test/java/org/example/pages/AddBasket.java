package org.example.pages;

import org.example.methods.Methods;
import org.openqa.selenium.By;

import  static org.example.driver.BaseTest.driver;

public class AddBasket {
    Methods methods;



    public  AddBasket(){
        methods=new Methods();
    }

    public  void AddBasket(){
        driver.findElement(By.id("button-cart")).click();
        methods.waitBySeconds(1);

    }
    public  void CheckBasket(){
        String count=driver.findElement(By.id("cart-items-text-container")).getText();
        System.out.println("Product count in basket --->>> " +count);
        methods.waitBySeconds(1);
    }

    public void goToBasket(){
        driver.findElement(By.id("cart")).click();
        methods.waitBySeconds(1);
        driver.findElement(By.id("js-cart")).click();
        methods.waitBySeconds(2);
    }


}
