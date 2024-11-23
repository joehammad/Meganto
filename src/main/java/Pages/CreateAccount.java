package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount extends Utilities {

    public CreateAccount (WebDriver driver) {
        super(driver);}

    public By FirstName = By.id("firstname");
    public By LastName = By.id ("lastname");
    public By Email = By.id ("email_address");
    public By Password = By.id ("password");
    public By ConfirmPass = By.id ("password-confirmation");
    public By CreateBtn = By.xpath ("(//*[text()='Create an Account'])[3]");

public void Register(){
FindElement(FirstName).sendKeys("youssef");
}
}