package pages;

import elements.DropDown;
import elements.InputField;
import elements.TextField;
import objects.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public void create(Account account) {
        new InputField(driver, "Account Name").writeInputData(account.getAccountName());
        new InputField(driver, "Website").writeInputData(account.getWebSite());
        new TextField(driver, "Description").writeTextData(account.getDescription());
        new TextField(driver, "Billing Street").writeTextData(account.getBillingAddress());
        new DropDown(driver, "Industry").selectOption(account.getIndustryType());
      //  clickSave();
    }

    public NewAccountModalPage clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
        return this;
    }
}
