package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    WebDriver driver;
    private By proceedCheckout = By.name("processCarrier");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    private By checkbox = By.cssSelector("div[class='checker']");

    public ShippingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDown(){

        js.executeScript("window.scrollBy(0,500);");
    }

    public void clickCheckbox(){
        driver.findElement(checkbox).click();
    }

    public PaymentMethodPage clickProceedButton(){
        driver.findElement(proceedCheckout).click();
        return new PaymentMethodPage(driver);
    }
}
