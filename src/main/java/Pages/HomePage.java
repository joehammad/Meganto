package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class HomePage extends Utilities {

    public By createAccount = By.xpath("(//*[text()='Create an Account'])[1]");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void ClickOnCreate() {

        driver.get("https://magento.softwaretestingboard.com/");
        clickOnElement(createAccount);

    }

}
