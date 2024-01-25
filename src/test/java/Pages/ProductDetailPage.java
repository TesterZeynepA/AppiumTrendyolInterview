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

    By addButton = By.id("android_add_button");
    By shoppingCartIcon = By.id("android_add_button");
    By productName = By.id("android_");
    public String productText;

    public void addProductToShoppingCart(){

        productText = methods.getText(productName);
        methods.click(addButton);
    }

    public void clickShoppingCartIcon(){
        methods.click(shoppingCartIcon);
    }
}
