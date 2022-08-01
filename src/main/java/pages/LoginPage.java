package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailLofin = By.id("email");
    private By passwordLogin = By.id("passwd");
    private By signIn = By.id("SubmitLogin");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmailAddress(String email){
     driver.findElement(emailLofin).sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(passwordLogin).sendKeys(password);
    }

    public MyAccountPage clickSignIn(){
        driver.findElement(signIn).click();
        return new MyAccountPage(driver);
    }


}
