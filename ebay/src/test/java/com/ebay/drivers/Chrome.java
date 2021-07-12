package com.ebay.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome extends RemoteDriver {

    @Override
    public ChromeOptions getCapabilities() {
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER_PATH"));
        var options = new ChromeOptions();
        options.setHeadless(isHeadless);

        options.addArguments("--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors")
                .setExperimentalOption("w3c", true);
        return options;
    }

    @Override
    public WebDriver getDriver() {
        return super.getDriver(() -> new ChromeDriver(getCapabilities()));
    }

}
