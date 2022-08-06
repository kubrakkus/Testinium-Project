package org.example.test;

import org.example.driver.BaseTest;
import org.example.pages.*;
import org.junit.Test;

public class RefreshTest extends BaseTest {

    @Test
    public void RefreshTest(){
        HomePage homePage = new HomePage();
        homePage.searchBook();
        RandomBook randomBook=new RandomBook();
        randomBook.randomBook();
        AddBasket addBasketTest=new AddBasket();
        addBasketTest.AddBasket();
        addBasketTest.CheckBasket();
        addBasketTest.goToBasket();
        AddQuantity addQuantity=new AddQuantity();
        addQuantity.addQuantity();
        Refresh refresh=new Refresh();
        refresh.refresh();
        refresh.checkRefresh();

    }


}
