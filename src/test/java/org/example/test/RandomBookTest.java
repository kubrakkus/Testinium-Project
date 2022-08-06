package org.example.test;

import org.example.driver.BaseTest;
import org.example.pages.HomePage;
import org.example.pages.RandomBook;
import org.junit.Test;

public class RandomBookTest extends BaseTest {
    @Test
    public  void randomBook(){
        HomePage homePage = new HomePage();
        homePage.searchBook();
        RandomBook randomBook=new RandomBook();
        randomBook.randomBook();
    }
}
