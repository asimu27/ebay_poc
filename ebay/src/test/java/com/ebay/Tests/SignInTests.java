package com.ebay.Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ebay.model.pages.HomePage;
import com.ebay.model.pages.SignInPage;

public class SignInTests extends BaseTests {

    @Test
    public void validateMandatorySignInErrors() {
        var homePage = new HomePage(driver);

        // Click on my ebay menu button
        homePage.clickMyEbayMenu();

        var signInPage = new SignInPage(driver);
        signInPage.clickContinueButton();
        assertEquals("Oops, that's not a match.", signInPage.getSignInError());
    }

}
