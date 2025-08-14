package com.juaracoding.ecom.authentications;

import com.juaracoding.ecom.utils.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @Before
    public void setup() {
        DriverUtil.openDriver();
    }

    @After
    public void teardown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
        DriverUtil.quitDriver();
    }
}
