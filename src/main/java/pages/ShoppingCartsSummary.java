package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ShoppingCartsSummary {
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    private By proceedButton = By.xpath("(//a[@class='button btn btn-default standard-checkout button-medium'])[1]");
    public ShoppingCartsSummary(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDown(){
        js.executeScript("window.scrollBy(0,1000);");
    }

    public AddressesPage clickProceedButton(){
        driver.findElement(proceedButton).click();
        System.out.println("Proceed button Shopping carts summary page");
        return new AddressesPage(driver);
    }
}
