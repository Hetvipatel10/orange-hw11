package tsetsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logintest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }


    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials() {

        //enter username
        WebElement usernameIdField = driver.findElement(By.name("username"));
        usernameIdField.sendKeys("Admin");

        //enter password into password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //click on login button
        WebElement loginButton = driver.findElement(By.xpath("//div[@class='orangehrm-login-layout']"));
        loginButton.click();


    }
    
    @After
   public void teardown(){
        closeBrowser();
    }



}



