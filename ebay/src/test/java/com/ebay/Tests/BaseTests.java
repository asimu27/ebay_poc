package com.ebay.Tests;

import java.util.concurrent.TimeUnit;

import com.ebay.drivers.DriverFactory;
import com.ebay.environment.EnvironmentVariables;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseTests {

    protected WebDriver driver;

    @BeforeEach
    public void setup() throws ReflectiveOperationException {
        // Read configuration from environment
        var browser = EnvironmentVariables.getBrowser();
        var wait = EnvironmentVariables.getImplicitWait();
        var url = EnvironmentVariables.getUrl();
        var headless = EnvironmentVariables.isHeadless();

        // Create driver and navigate to ebay.com.au

        driver = new DriverFactory().setHeadless(headless).getInstance(browser);
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(url);

    }

    @AfterEach
    public void shutdown() {
        driver.quit();
    }
}
