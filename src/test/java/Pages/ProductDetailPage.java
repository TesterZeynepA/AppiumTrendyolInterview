package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductDetailPage {
    AndroidDriver driver;
    ReusableMethods methods;

    public ProductDetailPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By addButton = By.id("trendyol.com:id/primaryButton");
    By shoppingCartIcon = By.id("trendyol.com:id/productDetailBasket");


    public void addProductToShoppingCart(){

        methods.click(addButton);
    }

    public void clickShoppingCartIcon(){
        methods.click(shoppingCartIcon);
    }
}
