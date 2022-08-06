package org.example.pages;

import org.example.methods.Methods;
import org.openqa.selenium.By;

import  static org.example.driver.BaseTest.driver;

public class DeleteBasket {

    Methods methods;



    public  DeleteBasket(){
        methods=new Methods();
    }

    public  void deleteBasket(){
        driver.findElement(By.cssSelector("i[title='Kaldır']")).click();
        methods.waitBySeconds(3);

    }
    public  void  checkDeleteBasket(){
        String emptyBasket=driver.findElement(By.id("cart-items-empty")).getText();
        if (emptyBasket.contains("Sepetiniz boş")) {
            System.out.println("empty basket");
        } else {
            System.out.println("not empty basket");
        }
    }
}
