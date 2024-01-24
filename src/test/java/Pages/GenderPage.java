package Pages;

import Utils.ReusableMethods;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GenderPage {
    AndroidDriver driver;
    ReusableMethods methods;

    public GenderPage(AndroidDriver androidDriver) {
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By erkekButton = By.id("trendyol.com:id/buttonSelectGenderMan");
    By kadinButton = By.id("trendyol.com:id/buttonSelectGenderWoman");
    By image = By.xpath("//android.widget.LinearLayout/android.widget.ImageView");
    By closeButton = By.id("trendyol.com:id/buttonDismiss");
    By text = By.xpath("//android.widget.TextView");

    public void checkGenderPage() {
        methods.checkElement(erkekButton);
    }

    public void checkImage() {
        methods.checkElement(image);
    }

    public void checkCloseButton() {
        methods.checkElement(closeButton);
    }

    public void checkKadinButtonText(String expectedText) {
        Assert.assertEquals(methods.getText(kadinButton), expectedText);
    }

    public void checkErkekButtonText(String expectedText){
       Assert.assertEquals(methods.getText(erkekButton), expectedText);
    }
    public void checkText(String expectedText){Assert.assertEquals(methods.getText(text), expectedText);}

    public void clickErkekButton(){methods.click(erkekButton);}

    public void clickKadinButton(){methods.click(kadinButton);}

    public void clickCloseButton(){methods.click(closeButton);}

}
