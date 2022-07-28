package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage {
    private WebDriver driver;
private By title = By.cssSelector("h1[class='page-heading']");
    public OrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getConfirmationTittle(){
         String header = driver.findElement(title).getText();
        return header;
    }


}
