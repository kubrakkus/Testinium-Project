package org.example.pages;

import org.example.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import  static org.example.driver.BaseTest.driver;
public class AddQuantity {
    Methods methods;



    public  AddQuantity(){
        methods=new Methods();
    }

    public  void addQuantity(){
      String count =  driver.findElement(By.cssSelector("input[name='quantity']")).getAttribute("value");
   //     String count=   driver.findElement(By.cssSelector("input[name='quantity']")).getText();
        System.out.println("Product count in basket --->>> " + count);
        int b = Integer.parseInt(count);
        System.out.println(b);

        int c = b+1;

     WebElement element = driver.findElement(By.cssSelector("input[name='quantity']"));
     element.clear();
      element.sendKeys((String.valueOf(c)));

        System.out.println("Product count in basket --->>> "+b+" eklendi = " +(c));


        methods.waitBySeconds(2);

    }
}
