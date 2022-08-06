package org.example.test;

import org.example.driver.BaseTest;
import org.example.pages.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public  void searchBook(){
        HomePage homePage = new HomePage();
        homePage.searchBook();
    }
}
