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
    By popUpMessage = By.id("trendyol.com:id/imageViewTooltipClose");

    public void clickProductOnProductPage(int productNumber){

        methods.click(popUpMessage);

        methods.scrollDown();
        methods.scrollDown();
        methods.scrollDown();

        methods.click(desiredProduct);


    }
}
