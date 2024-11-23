package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class CreateAccount extends Utilities {


    public By FirstName = By.id("firstname");
    public By LastNAme = By.id ("lastname");
    public By Email = By.id ("email_address");
    public By Password = By.id ("password");
    public By ConfirmPass = By.id ("password-confirmation");
    public By CreateBtn = By.xpath ("(//*[text()='Create an Account'])[3]");

public void Register(){
//FindElement(FirstName).sendKeys("youssef");
}
}
