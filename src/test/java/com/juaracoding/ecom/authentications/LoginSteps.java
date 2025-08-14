package com.juaracoding.ecom.authentications;

import com.juaracoding.ecom.utils.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    WebDriver driver;

    @Given("User di halaman login")
    public void Step01() {
        driver = DriverUtil.getDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
    }

    @When("User enters username {string} dan password {string}")
    public void Step02(String username, String password) {
        driver.findElement(By.id("txt-username")).sendKeys(username);
        driver.findElement(By.id("txt-password")).sendKeys(password);
    }

    @When("User click login")
    public void Step03() {
        driver.findElement(By.id("btn-login")).click();
    }

    @Then("User di halaman appointment")
    public void Step04() {
        driver.findElement(By.id("combo_facility")).isDisplayed();
    }

    @When("User selects facility {string}")
    public void Step05(String facility) {
        driver.findElement(By.id("combo_facility")).sendKeys(facility);
    }

    @When("User pilih date {string}")
    public void Step06(String date) {
        driver.findElement(By.id("txt_visit_date")).sendKeys(date);
    }

    @When("User clicks book appointment button")
    public void Step07() {
        driver.findElement(By.id("btn-book-appointment")).click();
    }

    @Then("Display appointment confirmation")
    public void Step08() {
        driver.findElement(By.xpath("//h2[contains(text(),'Appointment Confirmation')]")).isDisplayed();
    }
}
