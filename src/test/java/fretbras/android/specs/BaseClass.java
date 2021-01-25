package fretbras.android.specs;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {

    public void tapById(String element, AppiumDriver<MobileElement> driver) {
        MobileElement varElement = driver.findElement(By.id(element));
        varElement.click();
    }

    public void tapById(String element, String text, AppiumDriver<MobileElement> driver) {
        MobileElement varElement = driver.findElement(By.id(element));
        varElement.click();
        varElement.sendKeys(text);
    }

}