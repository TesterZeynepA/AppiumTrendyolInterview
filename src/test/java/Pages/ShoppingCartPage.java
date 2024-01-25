package Pages;

import Utils.DriverFactory;
import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage {
    AndroidDriver driver;
    ReusableMethods methods;
    ProductPage pp = new ProductPage(DriverFactory.getDriver());

    public ShoppingCartPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By increaseButton = By.id("trendyol.com:id/image_add");
    By copKutusu1 = By.id("trendyol.com:id/imageViewDeleteProduct");
    By copKutusu2 = By.id("trendyol.com:id/textViewBasketRemoveAction");
    By emptyMessage = By.id("trendyol.com:id/textViewMessage");
    By sepettekiUrunAdi = By.id("trendyol.com:id/textViewBrandName");

    public String sepettekiUrun;

    public void checkProductOnShoppingCartPageWithName(){

        sepettekiUrun = methods.getText(sepettekiUrunAdi);
        Assert.assertEquals(sepettekiUrun, pp.productText);
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
