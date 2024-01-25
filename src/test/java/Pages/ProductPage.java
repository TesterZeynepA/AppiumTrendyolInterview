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


    By popUpMessage = By.id("trendyol.com:id/imageViewTooltipClose");

    By productName = By.id("(//android.widget.TextView[@resource-id='trendyol.com:id/textview_title_product'])[3]");

    public static String productText;

    public void clickProductOnProductPage(int productNumber){

        methods.click(popUpMessage);

        methods.scrollDown();
        methods.scrollDown();

        productText = methods.getText(productName);

        methods.click(productName);


    }
}
