package tests;

import objects.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest {

    WebElement accountNameValue = driver.findElement(By.xpath("//*[@class='custom-truncate uiOutputText']"));
    WebElement billingAddressValue = driver.findElement(By.xpath("//*[contains(text(),'Billing Address')]"));
    public static final String LOGIN = "hlieb-unsw@force.com";
    public static final String PASSWORD = "Gq2KPsXekAb*ySd%";


    @Test
    public void createAccountTest() {
        Account realAccount = new Account("Automation Account 3", "www.tut.by", "Apparel");
        loginPage.openLoginPage()
                .login(LOGIN,PASSWORD);
        newAccountModalPage.openNewModalPage()
                .create(realAccount);
        softAssert.assertEquals(accountNameValue.getText(), "Automation Account", "Error");
        softAssert.assertEquals(billingAddressValue.getAttribute("getInnerText"), "Test Address", "Error");
    }
}