package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccount extends Utilities {

    public CreateAccount(WebDriver driver) {
        super(driver);
    }

    public By FirstName = By.id("firstname");
    public By LastName = By.id("lastname");
    public By Email = By.id("email_address");
    public By Password = By.id("password");
    public By ConfirmPass = By.id("password-confirmation");
    public By CreateBtn = By.xpath("(//*[text()='Create an Account'])[3]");
    public By Home = By.cssSelector("a[class=\"logo\"]");
    public By SuccessMsg = By.cssSelector("div.message-success.success.message");

    public String Register() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Fill in the registration fields
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstName)).sendKeys("youssef");
        wait.until(ExpectedConditions.visibilityOfElementLocated(LastName)).sendKeys("hammad");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Email)).sendKeys("test@t0ew74.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Password)).sendKeys("Test@12345");
        wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmPass)).sendKeys("Test@12345");


        wait.until(ExpectedConditions.elementToBeClickable(CreateBtn)).click();

        // Wait for the success message to appear
        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SuccessMsg));

        // Store the success message text
        String successMessage = successMessageElement.getText();

        // Click on the Home button to navigate to the homepage
        wait.until(ExpectedConditions.elementToBeClickable(Home)).click();

        // Return the success message to the BaseTest
        return successMessage;
    }
}
