package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By signInLink = By.cssSelector("a[title='Log in to your customer account']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage logIn(){
        driver.findElement(signInLink).click();
        return new LoginPage(driver);
    }
}
