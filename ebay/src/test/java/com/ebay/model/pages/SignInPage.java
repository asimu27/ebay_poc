package com.ebay.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);

    }

    public void clickContinueButton() {
        driver.findElement(By.id("signin-continue-btn")).click();
    }

    public String getSignInError() {
        return driver.findElement(By.id("signin-error-msg")).getText();
    }
}
