package com.ebay.model;

import com.ebay.model.pages.BasePage;
import com.ebay.model.pages.ShoppingCartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchedItemPage extends BasePage {

    public SearchedItemPage(WebDriver driver) {
        super(driver);

    }

    public String getTitleOfItem() {
        return driver.findElement(By.id("itemTitle")).getText();
    }

    public void selectColor(String color) {
        WebElement colorSelector = driver.findElement(By.xpath("//*[@id='msku-sel-1']"));
        Select select = new Select(colorSelector);
        select.selectByVisibleText(color);

    }

    public void clickAddToCartButton() {
        driver.findElement(By.id("isCartBtn_btn")).click();
    }

    public ShoppingCartPage clickNoThanksButton() {
        driver.findElement(By.xpath("//button[contains(text(),'No thanks')]")).click();
        return new ShoppingCartPage(driver);
    }
}
