package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OfferPage {
    AndroidDriver driver;
    ReusableMethods methods;

    public OfferPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By offerText = By.id("trendyol.com:id/textViewOpenNotification");
    By image = By.id("//android.widget.ImageView");
    By closeButton = By.id("trendyol.com:id/imageButtonClose");
    By yesButton = By.id("trendyol.com:id/buttonAccept");

    public void checkOfferPage(){
        methods.checkElement(offerText);
    }

    public void checkImage(){
        methods.checkElement(image);
    }

    public void checkCloseButton(){
        methods.checkElement(closeButton);
    }

    public void checkText(String expectedText){
        Assert.assertEquals(methods.getText(offerText),expectedText);
    }

    public void checkYesButton(String expectedText){
        Assert.assertEquals(methods.getText(yesButton),expectedText);
    }

    public void clickCloseButton(){
        methods.click(closeButton);
    }

}
