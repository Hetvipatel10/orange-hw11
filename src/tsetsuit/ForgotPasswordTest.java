package tsetsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static browserfactory.BaseTest.driver;
import static org.junit.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        //verify the text ‘Forgot Your Password?’
        WebElement text=driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']"));
        String actualText=text.getText();
        String expectedText="Forgot your password?";
        assertEquals(expectedText,actualText);

        //click on ‘Forgot your password’ link
        WebElement forgotpsLink=driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
       forgotpsLink.click();



    }
    @After
    public void tearDown() {
        closeBrowser();
    }




}
