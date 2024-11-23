package Tests;

import Pages.CreateAccount;
import Pages.HomePage;
import org.testng.annotations.Test;


public class BaseTest {


    @Test

    public void megantoTest(){
     HomePage homePage = new HomePage();
     CreateAccount createAccount = new CreateAccount();
     homePage.ClickOnCreate();
     createAccount.Register();



    }
}