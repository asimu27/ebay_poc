package com.ebay.model.pages;

import com.ebay.model.SearchedItemPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyEbayMenu() {
        driver.findElement(By.id("gh-eb-My")).click();
    }

    public void clickSearchButton() {
        driver.findElement(By.id("gh-btn")).click();
    }

    public void searchItem(String text) {
        driver.findElement(By.id("gh-ac")).sendKeys(text);
    }

    public String getTextOfFirstItem() {
        WebElement resultsContainer = driver.findElement(By.cssSelector("#srp-river-results"));
        var textOfFirstItem = resultsContainer.findElements(By.className("s-item__title")).get(0).getText();
        return textOfFirstItem;
    }

    public SearchedItemPage clickFirstItem() {

        WebElement resultsContainer = driver.findElement(By.cssSelector("#srp-river-results"));
        resultsContainer.findElements(By.className("s-item__title")).get(0).click();
        return new SearchedItemPage(driver);
    }

    public void clickOnCart() {
        driver.findElement(By.cssSelector("#gh-minicart-hover > div > a")).click();
    }
}
