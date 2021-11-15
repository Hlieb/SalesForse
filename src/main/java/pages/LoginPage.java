package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static final String LOGIN = "hlieb-unsw@force.com";
    public static final String PASSWORD = "Gq2KPsXekAb*ySd%";

    public LoginPage openLoginPage() {
        openStartPage(BASE_URL);
        return this;
    }

    public HomePage login() {
        driver.findElement(By.id("username")).sendKeys(LOGIN);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).click();
        return new HomePage(driver);
    }
}
