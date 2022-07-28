package PurchaseItem;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;

public class PurchaseTests extends BaseTest {
    @Test
    public void testSucessfullPurchase() throws InterruptedException {
        LoginPage loginPage = homepage.logIn();
        loginPage.enterEmailAddress("JohnDoe99@gmail.com");
        loginPage.enterPassword("SmokeTesting123");
        MyAccountPage myAccountPage = loginPage.clickSignIn();
        MainPage mainPage = myAccountPage.clickWomenLink();
        mainPage.clickAddToCarts();
        mainPage.clickContinueShopping();
        ShoppingCartsSummary shoppingCartsSummary = mainPage.hoverCarts();
        AddressesPage addressesPage = shoppingCartsSummary.clickProceedButton();
        ShippingPage shippingPage = addressesPage.clickProceedButton();
        shippingPage.clickCheckbox();
        PaymentMethodPage paymentMethodPage = shippingPage.clickProceedButton();
        OrderSummaryPage orderSummaryPage = paymentMethodPage.clickBankOption();
        OrderConfirmationPage orderConfirmationPage = orderSummaryPage.clickConfirmOrder();
        assertEquals(orderConfirmationPage.getConfirmationTittle(),"ORDER CONFIRMATION", "Alert text is incorrect");
    }
}
