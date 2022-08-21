package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String basUrl = "https://www.saucedemo.com/";

    @Before

    public void setUp(){

        openBrowser(basUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        //* Enter “standard_user” username

        WebElement EnterUsername = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
        EnterUsername.sendKeys("standard_user");



        //* Enter “secret_sauce” password
        WebElement EnterPassword = driver.findElement(By.xpath("//input[@id='password']"));
        EnterPassword.sendKeys("secret_sauce");



        //* Click on ‘LOGIN’ button

        WebElement ClickLogin = driver.findElement(By.xpath("//input[@type='submit']"));;
        ClickLogin.click();



        //* Verify the text “PRODUCTS”
        WebElement VerifyTest = driver.findElement(By.xpath("//span[@class='title']"));
        VerifyTest.getText();


    }

    @Test

    public void verifyThatSixProductsAreDisplayedOnPage(){

        //* Enter “standard_user” username

        WebElement EnterUSername = driver.findElement(By.xpath("//input[@id='user-name']"));
        EnterUSername.sendKeys("standard_user");



        //* Enter “secret_sauce” password

        WebElement EnterPassword = driver.findElement(By.xpath("//input[@id='password']"));
        EnterPassword.sendKeys("secret_sauce");



        //* Click on ‘LOGIN’ button
        WebElement ClickLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        ClickLogin.click();

        //* Verify that six products are displayed on page
        WebElement VerifyText = driver.findElement(By.xpath("//div[@class='inventory_list']"));
        VerifyText.getText();


    }
    @After
    public void tearDown(){

        //closeBrowser();
    }


}