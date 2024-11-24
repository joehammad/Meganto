package Tests;

import Pages.Compare;
import Pages.CreateAccount;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    // Set up WebDriver before each test
    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver (Chrome in this case)

        driver.manage().window().maximize();
    }

    // Tear down WebDriver after each test
    @AfterMethod
    public void tearDown() {
        // Close the browser and quit the WebDriver session after each test
        if (driver != null) {
            driver.quit();
        }
    }
public WebDriver driver = new ChromeDriver();
    @Test
    public void megantoTest() throws InterruptedException {
     HomePage homePage = new HomePage(driver);
     CreateAccount createAccount = new CreateAccount(driver);
     Compare compare = new Compare(driver);
     homePage.ClickOnCreate();
        // Register and capture the success message
        String successMessage = createAccount.Register();

        // Assert the success message

        String expectedMessage = "Thank you for registering with our store.";
        Assert.assertEquals(successMessage, "Thank you for registering with Main Website Store.");


        compare.CompareProducts();


    }

}