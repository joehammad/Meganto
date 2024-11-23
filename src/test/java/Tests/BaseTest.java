package Tests;

import Pages.CreateAccount;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BaseTest {

public WebDriver driver = new ChromeDriver();
    @Test
    public void megantoTest(){
     HomePage homePage = new HomePage(driver);
     CreateAccount createAccount = new CreateAccount(driver);
     homePage.ClickOnCreate();
     createAccount.Register();



    }
}