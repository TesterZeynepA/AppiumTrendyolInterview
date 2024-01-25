package Pages;

import Utils.DriverFactory;
import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage {
    AndroidDriver driver;
    ReusableMethods methods;
    ProductDetailPage pdp = new ProductDetailPage(DriverFactory.getDriver());

    public ShoppingCartPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By increaseButton = By.id("targetProduct");
    By copKutusu1 = By.id("targetProduct");
    By copKutusu2 = By.id("targetProduct");
    By emptyMessage = By.id("targetProduct");
    By sepettekiUrunAdi = By.id("");
    public String sepettekiUrun;

    public void checkProductOnShoppingCartPageWithName(){

        sepettekiUrun = methods.getText(sepettekiUrunAdi);
        Assert.assertEquals(sepettekiUrun, pdp.productText);
    }

    public void increaseProductByOne(){
        methods.click(increaseButton);
    }

    public void removeTheProductFromShoppingCart(){
        methods.click(copKutusu1);
        methods.click(copKutusu2);
    }

    public void checkEmptyMessage(String expectedText){

        Assert.assertEquals(methods.getText(emptyMessage), expectedText);

    }
}
