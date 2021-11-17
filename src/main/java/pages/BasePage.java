package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public static final String BASE_URL = "https://tms2.my.salesforce.com/";

    public void openUrl(String URL) {
        driver.get(URL);
    }
}