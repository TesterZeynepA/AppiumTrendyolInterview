package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage {
    AndroidDriver driver;
    ReusableMethods methods;

    public ShoppingCartPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By targetProduct = By.id("targetProduct");
    By increaseButton = By.id("targetProduct");
    By removeButton = By.id("targetProduct");
    By emptyMessage = By.id("targetProduct");

    public void checkProductOnShoppingCartPage(){
        methods.checkElement(targetProduct);
    }

    public void increaseProductByOne(){
        methods.click(increaseButton);
    }

    public void removeTheProductFromShoppingCart(){
        methods.click(removeButton);
    }

    public void checkEmptyMessage(String expectedText){

        Assert.assertEquals(methods.getText(emptyMessage), expectedText);

    }
}
