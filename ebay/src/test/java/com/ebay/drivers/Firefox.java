package com.ebay.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox extends RemoteDriver {

    @Override
    public FirefoxOptions getCapabilities() {
        var options = new FirefoxOptions();
        options.setHeadless(isHeadless);
        options.addArguments("-width 1920", "-height 1200");
        return options;
    }

    @Override
    public WebDriver getDriver() {
        return super.getDriver(() -> new FirefoxDriver(getCapabilities()));
    }

}
