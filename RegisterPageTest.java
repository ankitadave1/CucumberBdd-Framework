package com.demo.nopcommerce.tests;

import com.demo.nopcommerce.base.BasePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.utilities.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Properties;

public class RegisterPageTest {
    BasePage basePage; //I can create class level reference
    Properties prop;
    WebDriver driver;
    RegisterPage registerPage;

    @BeforeTest //BeforeTest for only 1 browser
    public void openBrowser() {

        basePage = new BasePage(); //I will initialise basePage here.
        prop = basePage.initialiseProperties();
        String browser = prop.getProperty("browser");
        driver = basePage.initialiseDriver(browser);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);
    }

    @Test(priority = 1)
    public void verifyRegistrationPageTitle() {
        String title = registerPage.getRegistrationPageTitle();
        System.out.println("Registration Page title is: " + title);
        Assert.assertEquals(title, Constants.REGISTER_PAGE_TITLE);
    }
     @Test(priority = 2)
    public void RegisterTest() throws InterruptedException {
      registerPage.registerUser(prop.getProperty("fn"), prop.getProperty("ln"),prop.getProperty("Date"),
              prop.getProperty("Month"), prop.getProperty("Year"),prop.getProperty("email"), prop.getProperty("CompanyName")
                , prop.getProperty("pwd"), prop.getProperty("ConfirmPwd"));
}

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}

