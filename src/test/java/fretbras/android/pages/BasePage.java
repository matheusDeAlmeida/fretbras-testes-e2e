package fretbras.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {

    public static void tapById(String element, AndroidDriver<MobileElement> driver) {
        MobileElement varElement = driver.findElementById(element);
        varElement.click();
    }

    public static void tapById(String element, String text, AndroidDriver<MobileElement> driver) {
        MobileElement varElement = driver.findElementById(element);
        varElement.click();
        varElement.sendKeys(text);
    }

    public static void tapByXpath(String element, AndroidDriver<MobileElement> driver) {
        MobileElement varElement = driver.findElementByXPath(element);
        varElement.click();
    }

}