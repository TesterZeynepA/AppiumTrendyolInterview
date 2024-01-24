package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductPage {
    AndroidDriver driver;
    ReusableMethods methods;

    public ProductPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By desiredProduct = By.id("android");

    public void clickProductOnProductPage(int productNumber){

        methods.scrollDown();
        methods.scrollDown();
        methods.scrollDown();

        methods.click(desiredProduct);


    }
}
