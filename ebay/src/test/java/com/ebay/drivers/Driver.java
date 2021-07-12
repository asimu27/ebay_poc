package com.ebay.drivers;

import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

public interface Driver {
    Driver executeHeadless(boolean isHeadless);

    Driver withGridUrl(URL gridUrl);

    Capabilities getCapabilities();

    WebDriver getDriver();

}
