package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage {

    private WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;
//    private By addToCartsButton = By.cssSelector(
//            "li[class='ajax_block_product last-item-of-tablet-line col-xs-12'] a[title='Add to cart'] span");
    private By addToCartsButton2 = By.cssSelector("a[title='Add to cart']");
    private By continueShopping = By.cssSelector("span[title='Continue shopping'] span:nth-child(1)");
    private By carts = By.cssSelector("a[title='View my shopping cart']");
    private By carts2 = By.className("shopping_cart");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    //Scroll Down
    public void scrollDown(){

        js.executeScript("window.scrollBy(0,1300);");
    }
    public void clickAddToCarts(){
        driver.findElements(addToCartsButton2).get(1).click();
    }

    public void clickContinueShopping(){
        driver.findElement(continueShopping).click();
    }

    public void scrollUp(){
        js.executeScript("window.scrollBy(0,-1300);");
    }
     public ShoppingCartsSummary hoverCarts(){
         WebElement cart = driver.findElement(carts2);
         Actions action = new Actions(driver);
         action.moveToElement(cart).click();
         return new ShoppingCartsSummary(driver);
     }





}
