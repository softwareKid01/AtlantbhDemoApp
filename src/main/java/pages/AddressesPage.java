package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AddressesPage {
    private WebDriver driver;
    private By proceedButtonAddress = By.xpath("//button[name='processAddress']");

    JavascriptExecutor js = (JavascriptExecutor) driver;
    public AddressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDown(){
        js.executeScript("window.scrollBy(0,1000);");
    }

    public ShippingPage clickProceedButton(){
        driver.findElement(proceedButtonAddress).click();
        System.out.println("Proceed button Addresses page");
        return new ShippingPage(driver);
    }
}
