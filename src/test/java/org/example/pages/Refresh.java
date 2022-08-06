package org.example.pages;

import org.example.methods.Methods;
import org.openqa.selenium.By;

import static org.example.driver.BaseTest.driver;


public class Refresh {
    Methods methods;


    public Refresh() {
        methods = new Methods();
    }

    public void refresh() {
        driver.findElement(By.cssSelector("i[title='Güncelle']")).click();
        methods.waitBySeconds(3);
    }

    public void checkRefresh() {
        String refreshCheck = driver.findElement(By.cssSelector("h2[class='swal2-title ky-swal-title-single']")).getText();


        if (refreshCheck.contains("Sepetiniz güncelleniyor")) {
            System.out.println("basket upgraded");
        } else {
            System.out.println("basket didn't upgrade");
        }


    }
}