package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static final String HOME_PAGE = "https://tms2.lightning.force.com/lightning/page/home";

    public HomePage openHomePage(String URL) {
        driver.get(HOME_PAGE);
        return this;
    }
}
