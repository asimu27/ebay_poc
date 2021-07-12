package com.ebay.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);

    }

    public String getTextOfItemFromShoppingCart() {
        return driver.findElement(By.xpath("//a[@data-test-id='cart-item-link']/span")).getText();

        // ("//*[@id="mainContent"]/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/h3/span/a/span/span"))
    }
}
