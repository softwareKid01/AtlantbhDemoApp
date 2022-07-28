package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage {
    private WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    private By confirmOrder = By.cssSelector("button[class='button btn btn-default button-medium']");
    public OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDown(){
        js.executeScript("window.scrollBy(0,1300);");
    }

    public OrderConfirmationPage clickConfirmOrder(){
        driver.findElement(confirmOrder).click();
        return new OrderConfirmationPage(driver);
    }



}
