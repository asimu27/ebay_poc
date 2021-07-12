package com.ebay.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.ebay.model.SearchedItemPage;
import com.ebay.model.pages.HomePage;
import com.ebay.model.pages.ShoppingCartPage;

import org.junit.jupiter.api.Test;

public class ValidateCartTests extends BaseTests {

    // Verify item added to cart is displayed in the cart
    @Test
    void validateItemAddedToShoppingCart() {

        var homePage = new HomePage(driver);
        // Search for item "bike"
        homePage.searchItem("bike");
        homePage.clickSearchButton();

        // Get text of first item searched
        var textResultItem = homePage.getTextOfFirstItem();

        var searchedItemPage = new SearchedItemPage(driver);

        // Click on the first bike item in the list
        searchedItemPage = homePage.clickFirstItem();

        // Get text of the item from the item searched page
        var itemTitle = searchedItemPage.getTitleOfItem();

        // If the text of the item from the search list and text of the item clicked
        // then proceed further
        if (textResultItem.equalsIgnoreCase(itemTitle)) {

            // Click color of the cycle
            searchedItemPage.selectColor("Grey");
            searchedItemPage.clickAddToCartButton();
        } else {

            System.out.println("The item was not found to put in cart");
            return;
        }
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        // Click on No Thanks button
        shoppingCartPage = searchedItemPage.clickNoThanksButton();

        var expectedText = shoppingCartPage.getTextOfItemFromShoppingCart();

        assertEquals(expectedText, textResultItem);

    }

}
