package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PaymentMethodPage {
    private WebDriver driver;
    private By bankWire = By.xpath("//a[@href='http://automationpractice.com/index.php?fc=module&module=bankwire&controller=payment']");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public PaymentMethodPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDown(){
        js.executeScript("window.scrollBy(0,1300);");
    }

    public OrderSummaryPage clickBankOption(){
        driver.findElement(bankWire).click();
        return new OrderSummaryPage(driver);
    }
}
