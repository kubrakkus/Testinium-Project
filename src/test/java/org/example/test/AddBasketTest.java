package org.example.test;

import org.example.driver.BaseTest;
import org.example.pages.AddBasket;
import org.example.pages.HomePage;
import org.example.pages.RandomBook;
import org.junit.Test;

public class AddBasketTest extends BaseTest {

    @Test
    public  void AddBasketTest(){
        HomePage homePage = new HomePage();
        homePage.searchBook();
        RandomBook randomBook=new RandomBook();
        randomBook.randomBook();
        AddBasket addBasketTest=new AddBasket();
        addBasketTest.AddBasket();
        addBasketTest.CheckBasket();
        addBasketTest.goToBasket();
    }
}
