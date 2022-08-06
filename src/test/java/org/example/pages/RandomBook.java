package org.example.pages;

import org.example.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import  static org.example.driver.BaseTest.driver;

public class RandomBook {
    Methods methods;

    public RandomBook() {
        methods = new Methods();
    }

    public void randomBook() {
        List<WebElement> allProducts = driver.findElements(By.cssSelector("div[class='name']"));
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        methods.waitBySeconds(1);

    }
}


