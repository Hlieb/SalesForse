package pages;

import elements.InputField;
import elements.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccountModalPage extends BasePage {

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public static final String SAVE_BUTTON_XPATH = "//*[contains(@class,'forceActionButton')]//*[text()='Save']";
    public static final String URL = "https://tms2.lightning.force.com/lightning/o/Account/new";

    public NewAccountModalPage openNewModalPage() {
        driver.get(URL);
        return this;
    }

    public NewAccountModalPage fillInputField(String accountName, String webSite) {
        new InputField(driver, "Account Name").writeInputData(accountName);
        new InputField(driver, "Website").writeInputData(webSite);
        return this;
    }

    public NewAccountModalPage fillTextField(String description, String billingStreet) {
        new TextField(driver, "Description").writeTextData(description);
        new TextField(driver, "Billing Street").writeTextData(billingStreet);
        return this;
    }

    public NewAccountModalPage clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
        return this;
    }
}
