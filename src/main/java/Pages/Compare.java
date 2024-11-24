package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Compare extends Utilities {
    public Compare(WebDriver driver) {
        super(driver);}

    public By FirstProduct = By.partialLinkText("Radiant Tee");
    public By SecondProduct = By.partialLinkText("Breathe-Easy Tank");
    public By CompareBtn = By.cssSelector("a[class='action tocompare']");
    public By AddToCompare = By.partialLinkText("ADD TO COMPARE");

    public void CompareProducts() throws InterruptedException {
        Actions actions = new Actions(driver);

        WebElement firstProductElement = driver.findElement(FirstProduct);

        actions.moveToElement(firstProductElement).perform();
        Thread.sleep(3000);
        FindElement(CompareBtn).click();


        WebElement SecondProductElement = driver.findElement(SecondProduct);

        actions.moveToElement(SecondProductElement).perform();
        Thread.sleep(3000);
        FindElement(AddToCompare).click();


    }
}
