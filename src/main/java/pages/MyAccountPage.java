package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    WebDriver driver;
    private By womenLink = By.linkText("Women");
    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage clickWomenLink(){
        driver.findElement(womenLink).click();
        return new MainPage(driver);
    }
}
