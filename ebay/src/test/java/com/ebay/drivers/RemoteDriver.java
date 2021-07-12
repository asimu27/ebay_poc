package com.ebay.drivers;

import java.net.URL;
import java.util.Optional;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class RemoteDriver implements Driver {

    protected boolean isHeadless;
    protected URL gridUrl;

    @Override
    public Driver executeHeadless(boolean isHeadless) {
        this.isHeadless = isHeadless;
        return this;
    }

    @Override
    public Driver withGridUrl(URL gridUrl) {
        this.gridUrl = gridUrl;
        return this;
    }

    protected WebDriver getDriver(Supplier<WebDriver> localWebDriver) {
        return Optional.ofNullable(gridUrl).<WebDriver>map(u -> new RemoteWebDriver(u, getCapabilities()))
                .orElseGet(localWebDriver);
    }

}
