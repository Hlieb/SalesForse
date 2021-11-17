package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AccountTests extends BaseTest {

    WebElement accountNameValue = driver.findElement(By.xpath("//*[@class='custom-truncate uiOutputText']"));
    WebElement billingAddressValue = driver.findElement(By.xpath("//*[contains(text(),'Billing Address')]"));

    @Test
    public void createAccountTest() {
        loginPage.openLoginPage()
                .login();
        newAccountModalPage.openNewModalPage()
                .fillInputField("Automation Account", "www.testwebsite.com")
                .fillTextField("Test description", "Test Address")
                .clickSave();
        softAssert.assertEquals(accountNameValue.getText(), "Automation Account", "Error");
        softAssert.assertEquals(billingAddressValue.getAttribute("getInnerText"), "Test Address", "Error");
    }
}